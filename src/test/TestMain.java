//
//
//
//import org.bouncycastle.asn1.x500.X500Name;
//import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
//import org.bouncycastle.jce.provider.JCEECPrivateKey;
//import org.bouncycastle.jce.provider.JCEECPublicKey;
//import org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder;
//
//import java.math.BigInteger;
//import java.security.KeyPair;
//import java.security.spec.ECFieldFp;
//import java.security.spec.EllipticCurve;
//
//public class TestMain {
//
//    public static void main(String[] args) {
//        byte p[] =
//                {
//                        (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFE, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
//                        (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
//                        (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
//                        (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF
//                };
//        byte a[] =
//                {
//                        (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFE, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
//                        (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
//                        (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
//                        (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFC
//                };
//        byte b[] =
//                {
//                        (byte) 0x28, (byte) 0xE9, (byte) 0xFA, (byte) 0x9E, (byte) 0x9D, (byte) 0x9F, (byte) 0x5E, (byte) 0x34,
//                        (byte) 0x4D, (byte) 0x5A, (byte) 0x9E, (byte) 0x4B, (byte) 0xCF, (byte) 0x65, (byte) 0x09, (byte) 0xA7,
//                        (byte) 0xF3, (byte) 0x97, (byte) 0x89, (byte) 0xF5, (byte) 0x15, (byte) 0xAB, (byte) 0x8F, (byte) 0x92,
//                        (byte) 0xDD, (byte) 0xBC, (byte) 0xBD, (byte) 0x41, (byte) 0x4D, (byte) 0x94, (byte) 0x0E, (byte) 0x93
//                };
//
//        byte gx[] =
//                {
//                        (byte) 0x32, (byte) 0xC4, (byte) 0xAE, (byte) 0x2C, (byte) 0x1F, (byte) 0x19, (byte) 0x81, (byte) 0x19,
//                        (byte) 0x5F, (byte) 0x99, (byte) 0x04, (byte) 0x46, (byte) 0x6A, (byte) 0x39, (byte) 0xC9, (byte) 0x94,
//                        (byte) 0x8F, (byte) 0xE3, (byte) 0x0B, (byte) 0xBF, (byte) 0xF2, (byte) 0x66, (byte) 0x0B, (byte) 0xE1,
//                        (byte) 0x71, (byte) 0x5A, (byte) 0x45, (byte) 0x89, (byte) 0x33, (byte) 0x4C, (byte) 0x74, (byte) 0xC7
//                };
//
//        byte gy[] =
//                {
//                        (byte) 0xBC, (byte) 0x37, (byte) 0x36, (byte) 0xA2, (byte) 0xF4, (byte) 0xF6, (byte) 0x77, (byte) 0x9C,
//                        (byte) 0x59, (byte) 0xBD, (byte) 0xCE, (byte) 0xE3, (byte) 0x6B, (byte) 0x69, (byte) 0x21, (byte) 0x53,
//                        (byte) 0xD0, (byte) 0xA9, (byte) 0x87, (byte) 0x7C, (byte) 0xC6, (byte) 0x2A, (byte) 0x47, (byte) 0x40,
//                        (byte) 0x02, (byte) 0xDF, (byte) 0x32, (byte) 0xE5, (byte) 0x21, (byte) 0x39, (byte) 0xF0, (byte) 0xA0
//                };
//
//        byte n[] =
//                {
//                        (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFE, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
//                        (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
//                        (byte) 0x72, (byte) 0x03, (byte) 0xDF, (byte) 0x6B, (byte) 0x21, (byte) 0xC6, (byte) 0x05, (byte) 0x2B,
//                        (byte) 0x53, (byte) 0xBB, (byte) 0xF4, (byte) 0x09, (byte) 0x39, (byte) 0xD5, (byte) 0x41, (byte) 0x23
//                };
//
//
//        byte[] pX = new byte[32];
//        byte[] pY = new byte[32];
//        byte[] pD = new byte[32];
//        byte[] pPub = {
//                (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00,
//                (byte) 0x0F, (byte) 0xB0, (byte) 0x5F, (byte) 0x40, (byte) 0xA5, (byte) 0xFE, (byte) 0x52, (byte) 0xC9, (byte) 0xEE, (byte) 0x44, (byte) 0x57, (byte) 0x64, (byte) 0x77, (byte) 0x2A, (byte) 0x93, (byte) 0xA2, (byte) 0xA8, (byte) 0x86, (byte) 0x57, (byte) 0xAF, (byte) 0x47, (byte) 0x10, (byte) 0xFE, (byte) 0x17, (byte) 0x9F, (byte) 0xDA, (byte) 0xAC, (byte) 0xDE, (byte) 0xF3, (byte) 0x35, (byte) 0x39, (byte) 0x6B,
//                (byte) 0xCA, (byte) 0x76, (byte) 0xB5, (byte) 0x7C, (byte) 0xDE, (byte) 0x31, (byte) 0x0A, (byte) 0x7B, (byte) 0xAF, (byte) 0xCA, (byte) 0xD3, (byte) 0xBD, (byte) 0xC4, (byte) 0xAF, (byte) 0x32, (byte) 0x68, (byte) 0xDB, (byte) 0x4F, (byte) 0xA7, (byte) 0xF9, (byte) 0x46, (byte) 0x1A, (byte) 0x59, (byte) 0x3B, (byte) 0xB3, (byte) 0x98, (byte) 0x7A, (byte) 0xD0, (byte) 0x71, (byte) 0xD9, (byte) 0xD3, (byte) 0x39
//        };
//
//        byte[] pPri = {
//                (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00,
//                (byte) 0x0E, (byte) 0xBE, (byte) 0xB1, (byte) 0x5C, (byte) 0x14, (byte) 0x5B, (byte) 0x35, (byte) 0x4C, (byte) 0xD4, (byte) 0xBF, (byte) 0x53, (byte) 0x77, (byte) 0x18, (byte) 0x32, (byte) 0x8E, (byte) 0x9B, (byte) 0x09, (byte) 0x32, (byte) 0x2D, (byte) 0xA2, (byte) 0xCD, (byte) 0x03, (byte) 0xFF, (byte) 0x1B, (byte) 0x73, (byte) 0x87, (byte) 0xA0, (byte) 0x25, (byte) 0x46, (byte) 0x93, (byte) 0x3E, (byte) 0xBD
//        };
//
//        System.out.println(pPub.length);
//
//
//        BigInteger BnD = null;
//        java.security.spec.ECPoint pubPoin = null;
//        System.arraycopy(pPub, 4, pX, 0, pX.length);
//        System.arraycopy(pPub, 36, pY, 0, pY.length);
//
//        BigInteger BnX = new BigInteger(1, pX);
//        BigInteger BnY = new BigInteger(1, pY);
//
//        pubPoin = new java.security.spec.ECPoint(BnX, BnY);
//
//        System.arraycopy(pPri, 4, pD, 0, pD.length);
//
//        BnD = new BigInteger(1, pD);
//
//        EllipticCurve EllC = new EllipticCurve(new ECFieldFp(new BigInteger(1, p)), new BigInteger(1, a), new BigInteger(1, b));
//        java.security.spec.ECPoint Gpoint = new java.security.spec.ECPoint(new BigInteger(1, gx), new BigInteger(1, gy));
//        java.security.spec.ECParameterSpec spec =
//                new java.security.spec.ECParameterSpec(EllC, Gpoint, new BigInteger(1, n), 1);
//
//        java.security.spec.ECPublicKeySpec ecpubSpec = new java.security.spec.ECPublicKeySpec(pubPoin,spec);
//
//        java.security.spec.ECPrivateKeySpec ecpriSpec = new java.security.spec.ECPrivateKeySpec(BnD, spec);
//
//        KeyPair kp =  new KeyPair(new JCEECPublicKey("SM2", ecpubSpec),
//                new JCEECPrivateKey("SM2", ecpriSpec));
//
//
//        String subject = "CN=3H043F4YAZ7C4E6_NULL, O=02, L=BJQ, ST=ZJ, C=CN";
//        PKCS10CertificationRequestBuilder builder = new PKCS10CertificationRequestBuilder(new X500Name(subject), SubjectPublicKeyInfo.getInstance(kp.getPublic()));
//
//    }
//}
