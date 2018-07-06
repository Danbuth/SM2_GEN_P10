package com.hznu;

import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder;
import org.bouncycastle.util.encoders.Base64;
import org.bouncycastle.util.encoders.Hex;

import java.io.IOException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

/**
 * 生成SM2的证书请求码
 */
public class GenSM2P10 {

    /**
     * SubjectPublicKeyInfo 的
     * SM2 algorithmIdentifier
     * 参数内容为：
     * OBJECT IDENTIFIER    1.2.840.10045.2.1       ecPublicKey
     * OBJECT IDENTIFIER    1.2.156.10197.1.301     SM2
     */
    private static final String SM2SUBJECTPUBKEYINFOALG = "MFkwEwYHKoZIzj0CAQYIKoEcz1UBgi0DQgAE";

    /**
     * @param subject      使用者信息
     * @param pubkeyBase64 公钥的base64字符串
     * @return SM2 P10 (base64)
     */
    private static String genCRS(String subject, String pubkeyBase64) throws NoSuchAlgorithmException, OperatorCreationException, IOException {
        String signalg = "";
        int alglength = 0;
        String keyAlg = "";


        //签名算法
        signalg = "SM3withSM2";
        alglength = 256;
        //密钥算法
        keyAlg = "EC";

        KeyPairGenerator keyGen = KeyPairGenerator.getInstance(keyAlg);
        keyGen.initialize(alglength);
        KeyPair kp = keyGen.generateKeyPair();
        byte[] algInfo = Base64.decode(SM2SUBJECTPUBKEYINFOALG);
        byte[] keyInfo = Base64.decode(pubkeyBase64);
        byte[] subjectPublicKeyInfo = new byte[algInfo.length + keyInfo.length];
        System.arraycopy(algInfo, 0, subjectPublicKeyInfo, 0, algInfo.length);
        System.arraycopy(keyInfo, 0, subjectPublicKeyInfo, algInfo.length, keyInfo.length);

        PKCS10CertificationRequestBuilder builder = new PKCS10CertificationRequestBuilder(new X500Name(subject), SubjectPublicKeyInfo.getInstance(subjectPublicKeyInfo));

        JcaContentSignerBuilder jcaContentSignerBuilder = new JcaContentSignerBuilder(signalg);
        ContentSigner contentSigner = jcaContentSignerBuilder.build(kp.getPrivate());

        PKCS10CertificationRequest request = builder.build(contentSigner);

        byte[] p10Bytes = request.getEncoded();

        return Base64.toBase64String(p10Bytes);
    }


    public static void main(String[] args) {


        Security.addProvider(new BouncyCastleProvider());

        String dn = "CN=3H043F4YAZ7C4E6_NULL, O=02, L=BJQ, ST=ZJ, C=CN";
        String bp = Base64.toBase64String(Hex.decode(
                "49e9d66d658919b2d528b23554e6c08e26bd7f87a42eda0fabd142150a3426fe55bbf3a504f4e0035657b3839f3953786568ba1a3ccf272363a9acf92343688b"));

        try {
            String p10 = genCRS(dn, bp);
            System.out.println(p10);
        } catch (NoSuchAlgorithmException | OperatorCreationException | IOException e) {
            e.printStackTrace();
        }
    }
}
