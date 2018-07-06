//import com.fmjnicard.fm_jni_api;
//import org.bouncycastle.util.encoders.Hex;
//
//public class ImportECCKey {
//
//
//    public static void Import() {
//        byte[] pix = {(byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00};
//        String publickey = "49e9d66d658919b2d528b23554e6c08e26bd7f87a42eda0fabd142150a3426fe55bbf3a504f4e0035657b3839f3953786568ba1a3ccf272363a9acf92343688b";
//        byte[] publicBytes = Hex.decode(publickey);
//        byte[] allPubkeyInfo = new byte[pix.length + publicBytes.length];
//        System.arraycopy(pix, 0, allPubkeyInfo, 0, pix.length);
//        System.arraycopy(publicBytes, 0, allPubkeyInfo, pix.length, publicBytes.length);
//
//        System.out.println(Hex.toHexString(allPubkeyInfo));
//
//
//        byte[] pPri = {
//                (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00,
//                (byte) 0x0E, (byte) 0xBE, (byte) 0xB1, (byte) 0x5C, (byte) 0x14, (byte) 0x5B, (byte) 0x35, (byte) 0x4C, (byte) 0xD4, (byte) 0xBF, (byte) 0x53, (byte) 0x77, (byte) 0x18, (byte) 0x32, (byte) 0x8E, (byte) 0x9B, (byte) 0x09, (byte) 0x32, (byte) 0x2D, (byte) 0xA2, (byte) 0xCD, (byte) 0x03, (byte) 0xFF, (byte) 0x1B, (byte) 0x73, (byte) 0x87, (byte) 0xA0, (byte) 0x25, (byte) 0x46, (byte) 0x93, (byte) 0x3E, (byte) 0xBD
//        };
//
//        byte[] id = new byte[1];
//        int rv = 0;
//        id[0] = 0;
//
//        rv = fm_jni_api.FM_CPC_JNI_OpenDevice(id, fm_jni_api.FM_DEV_TYPE_PCIE_1_0X, fm_jni_api.FM_OPEN_MULTITHREAD | fm_jni_api.FM_OPEN_MULTIPROCESS);
//        if(rv != 0){
//            System.out.println("FM_CPC_JNI_OpenDevice is error");
//        }
//
//        int hkey[] = new int[1];
//
//        hkey[0] = 333;
//        rv = fm_jni_api.FM_CPC_JNI_ImportECCKeypair(hkey, allPubkeyInfo, pPri);
//        if (rv != 0)
//        {
//            System.out.println("import SM2 key error\n");
//        }
//
//        //关闭设备
//        rv = fm_jni_api.FM_CPC_JNI_CloseDevice();
//        if(rv != 0){
//            System.out.println("FM_CPC_JNI_CloseDevice is error, rv = " + rv);
//        }
//
//
//    }
//
//
//}
