//import org.bouncycastle.asn1.x500.X500Name;
//import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
//import org.bouncycastle.asn1.x509.X509Name;
//import org.bouncycastle.asn1.x9.X9ECParameters;
//import org.bouncycastle.crypto.util.PublicKeyFactory;
//import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;
//import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
//import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
//
//import org.bouncycastle.jcajce.spec.SM2ParameterSpec;
//import org.bouncycastle.jce.ECNamedCurveTable;
//import org.bouncycastle.jce.provider.BouncyCastleProvider;
//import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
//import org.bouncycastle.jce.spec.ECParameterSpec;
//import org.bouncycastle.jce.spec.ECPublicKeySpec;
//import org.bouncycastle.math.ec.ECCurve;
//import org.bouncycastle.math.ec.ECPoint;
//import org.bouncycastle.math.ec.custom.gm.SM2P256V1Curve;
//
//import org.bouncycastle.math.ec.custom.gm.SM2P256V1Point;
//import org.bouncycastle.operator.ContentSigner;
//import org.bouncycastle.operator.OperatorCreationException;
//import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
//import org.bouncycastle.pkcs.PKCS10CertificationRequest;
//import org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder;
//import org.bouncycastle.util.encoders.Base64;
//import org.bouncycastle.util.encoders.Hex;
//
//import java.io.IOException;
//import java.math.BigInteger;
//
//import java.security.*;
//
//import java.security.spec.InvalidKeySpecException;
//
//
//public class Main {
//    public static String genCSR(String subject, String alg, PublicKey publicKey)
//            throws NoSuchAlgorithmException,
//            OperatorCreationException, IOException, NoSuchAlgorithmException, OperatorCreationException {
//        String signalg = "";
//        int alglength = 0;
//        String keyAlg = "";
//        if (alg.toUpperCase().equals("RSA1024")) {
//            signalg = "SHA1WithRSA";
//            alglength = 1024;
//            keyAlg = "RSA";
//        } else if (alg.toUpperCase().equals("RSA2048")) {
//            signalg = "SHA1WithRSA";
//            alglength = 2048;
//            keyAlg = "RSA";
//        } else if (alg.toUpperCase().equals("SM2")) {
//            signalg = "SM3withSM2";
//            alglength = 256;
//            keyAlg = "EC";
//        }
//        KeyPairGenerator keyGen = (KeyPairGenerator) KeyPairGenerator.getInstance(keyAlg);
//        keyGen.initialize(alglength);
//        KeyPair kp = keyGen.generateKeyPair();
////        byte[] heradByte = new byte[]{48, 89, 48, 19, 6, 7, 42, -122, 72, -50, 61, 2, 1, 6, 8, 42, -122, 72, -50, 61, 3, 1, 7, 3, 66, 0, 4};
////        byte[] data = byteMerger(heradByte, pkdata);
//
//
////        PKCS10CertificationRequest request = new PKCS10CertificationRequest(signalg, new X509Name(subject), , null, kp.getPrivate());
//
//
////        PKCS10CertificationRequest request = new PKCS10CertificationRequestBuilder();
//
//        PKCS10CertificationRequestBuilder builder = new PKCS10CertificationRequestBuilder(new X500Name(subject), SubjectPublicKeyInfo.getInstance(publicKey));
//        JcaContentSignerBuilder jcaContentSignerBuilder = new JcaContentSignerBuilder(signalg);
////        jcaContentSignerBuilder.setProvider("FishermanJCE");
//        ContentSigner contentSigner = jcaContentSignerBuilder.build(kp.getPrivate());
//        PKCS10CertificationRequest request = builder.build(contentSigner);
////
////        byte[] encoded2 = request.getEncoded();
////        return new String(Base64.encode(encoded2));
//
//        return "1111";
//
//
//    }
//
////    //合并两个byte数组
////    public static byte[] byteMerger(byte[] byte_1, byte[] byte_2) {
////        byte[] byte_3 = new byte[byte_1.length + byte_2.length];
////        System.arraycopy(byte_1, 0, byte_3, 0, byte_1.length);
////        System.arraycopy(byte_2, 0, byte_3, byte_1.length, byte_2.length);
////        return byte_3;
////    }
//
//
//    public static void main(String[] args) throws NoSuchAlgorithmException, IOException, InvalidKeySpecException, NoSuchAlgorithmException, NoSuchProviderException, OperatorCreationException {
//
//
////        ImportECCKey.Import();
//
//        GenP10.genP10();
//
////        Security.addProvider(new BouncyCastleProvider());
////        X9ECParameters x9ECParameters = ECUtil.getNamedCurveByName("sm2p256v1");
////
////        ECParameterSpec parameterSpec = new ECParameterSpec(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN());
////        BigInteger x = new BigInteger(1, Hex.decode("49e9d66d658919b2d528b23554e6c08e26bd7f87a42eda0fabd142150a3426fe"));
////        BigInteger y = new BigInteger(1, Hex.decode("55bbf3a504f4e0035657b3839f3953786568ba1a3ccf272363a9acf92343688b"));
////        ECPoint ecPoint = x9ECParameters.getCurve().createPoint(x, y);
////
////        ECPublicKeySpec keySpec = new ECPublicKeySpec(ecPoint,parameterSpec);
////        KeyFactory keyFactory = KeyFactory.getInstance("EC");
////        PublicKey publicKey = keyFactory.generatePublic(keySpec);
////        System.out.println(publicKey.getAlgorithm());
////        System.out.println(publicKey.toString());
////        System.out.println(Hex.toHexString(publicKey.getEncoded()));
////
////
////
////
////
////        String subject = "CN=3H043F4YAZ7C4E6_NULL, O=02, L=BJQ, ST=ZJ, C=CN";
//////        String key = "AAEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAASenWbWWJGbLVKLI1VObAjia9f4ekLtoPq9FCFQo0Jv4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAFW786UE9OADVlezg585U3hlaLoaPM8nI2OprPkjQ2iL";
//////        byte[] pkdata = Base64.decode(key);
//////        byte[] x = new byte[32];
//////        byte[] y = new byte[32];
//////        System.arraycopy(pkdata, 36, x, 0, 32);
//////        System.arraycopy(pkdata, 36 + 32 + 32, y, 0, 32);
//////        byte[] data = byteMerger(x, y);
////        String res =  genCSR(subject,"SM2",publicKey);
////        System.out.println(res);
////
//////        System.out.println(Hex.toHexString(Base64.decode("BggqgRzPVQGCLQ==")));
//
//
//    }
//
//}
