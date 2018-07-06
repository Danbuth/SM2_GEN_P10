//import fisher.man.asn1.x509.X509Name;
//import fisher.man.jce.PKCS10CertificationRequest;
//import fisher.man.util.encoders.Base64;
//
//import java.security.KeyPair;
//import java.security.KeyPairGenerator;
//import java.security.SecureRandom;
//
//public class GenP10 {
//
//    public static void genP10() {
////        securityService.createP10Request("SM2", "SM3withSM2", adminKey.getKeynum(), adminKey.getBits(), sysConfService.getSysConfValue().getP10Dn());
//
//        KeyPair kp = null;
//        try {
//            KeyPairGenerator kpgen = KeyPairGenerator.getInstance("SM2", "FishermanJCE");
//            String keyid = "Random" + "SM2";
//            keyid += "PubKey";
//            keyid += "333";
//            SecureRandom rand = SecureRandom.getInstance(keyid, "FishermanJCE");
//            //SM2: keysize固定是256
//            kpgen.initialize(256, rand);
//
//            kp = kpgen.generateKeyPair();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        if (kp == null){
//            return;
//        }
//        byte[] res = null;
//        try {
//
//            PKCS10CertificationRequest request = new PKCS10CertificationRequest("SM3withSM2",
//                    new X509Name("CN=3H043F4YAZ7C4E6_NULL,O=02,L=BJQ,ST=ZJ,C=CN"), kp.getPublic(), null, kp.getPrivate());
//            //生成p10的der编码
//            byte[] buf = request.getDEREncoded();
//            //进行base64编码; new String(res)：转成字符串
//            res = Base64.encode(buf);
//            System.out.println(new String(res));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//}
