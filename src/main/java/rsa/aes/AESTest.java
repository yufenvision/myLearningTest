package rsa.aes;

import org.apache.commons.codec.binary.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * @Description: AES加密
 * @Author: dyf
 * @Date: 2020/11/17 14:29
 */
public class AESTest {
    public static void main(String[] args){
        String skey = "";

        try {
            System.out.println(encrypt("test","1234567890123456"));

            System.out.println(decrypt("3fvaLg5IDlveswuXzhVQcw==","1234567890123456"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static String encrypt(String sSrc, String sKey) throws Exception {
        if (sKey == null) {
            System.out.print("Key 为空 null");
            return null;
        }
        // 判断 Key 是否为 16 位
        if (sKey.length() != 16) {
            System.out.print("Key 长度不是 16 位");
            return null;
        }
        byte[] raw = sKey.getBytes("utf-8");
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");//"算法/模式/补码方式"
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(sSrc.getBytes("utf-8"));
        return new Base64().encodeToString(encrypted);//此处使用 BASE64 做转码功能，同时能起到 2 次加密的作用。
    }

    public static String decrypt(String data, String key) throws Exception {
        try {
            byte[] encrypted1 = new Base64().decode(data);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            SecretKeySpec keyspec = new SecretKeySpec(key.getBytes("utf-8"), "AES");

            cipher.init(Cipher.DECRYPT_MODE, keyspec);

            byte[] original = cipher.doFinal(encrypted1);
            String originalString = new String(original);
            return originalString;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
