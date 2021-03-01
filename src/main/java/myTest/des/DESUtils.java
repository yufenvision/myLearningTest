package myTest.des;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.io.IOException;
import java.security.SecureRandom;

/**
 * @Author: ldq
 * @Date: 2019/9/29 10:33
 * @Version 1.0
 */
public class DESUtils {

    private final static String DES = "DES";
    /**
     * Description 根据键值进行加密
     * @param data
     * @param key  加密键byte数组
     * @return
     * @throws Exception
     */
    public static String encrypt(String data, String key) throws Exception {
        byte[] bt = encrypt(data.getBytes(), key.getBytes());
        String strs = new BASE64Encoder().encode(bt);
        return strs;
    }

    /**
     * Description 根据键值进行解密
     * @param data
     * @param key  加密键byte数组
     * @return
     * @throws IOException
     * @throws Exception
     */
    public static String decrypt(String data, String key) throws IOException,
            Exception {
        if (data == null)
            return null;
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] buf = decoder.decodeBuffer(data);
        byte[] bt = decrypt(buf,key.getBytes());
        return new String(bt);
    }

    /**
     * Description 根据键值进行加密
     * @param data
     * @param key  加密键byte数组
     * @return
     * @throws Exception
     */
    private static byte[] encrypt(byte[] data, byte[] key) throws Exception {
        Holder<SecureRandom, SecretKey> holder = getKeyAndDataSource(key);
        // Cipher对象实际完成加密操作
        Cipher cipher = Cipher.getInstance(DES);
        // 用密钥初始化Cipher对象
        cipher.init(Cipher.ENCRYPT_MODE, holder.getT(), holder.getR());
        return cipher.doFinal(data);
    }

    /**
     * Description 根据键值进行解密
     * @param data
     * @param key  加密键byte数组
     * @return
     * @throws Exception
     */
    private static byte[] decrypt(byte[] data, byte[] key) throws Exception {
        Holder<SecureRandom, SecretKey> holder = getKeyAndDataSource(key);
        // Cipher对象实际完成解密操作
        Cipher cipher = Cipher.getInstance(DES);
        // 用密钥初始化Cipher对象
        cipher.init(Cipher.DECRYPT_MODE, holder.getT(), holder.getR());
        return cipher.doFinal(data);
    }

    private static Holder<SecureRandom, SecretKey> getKeyAndDataSource(byte[] key) throws Exception {
        // 生成一个可信任的随机数源
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        // 从原始密钥数据创建DESKeySpec对象
        DESKeySpec dks = new DESKeySpec(key);
        // 创建一个密钥工厂，然后用它把DESKeySpec转换成SecretKey对象
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
        SecretKey securekey = keyFactory.generateSecret(dks);
        return new Holder<>(sr, securekey);
    }

    static class Holder<R, T> {
        private R r;
        private T t;
        public Holder(R r, T t) {
            this.r = r;
            this.t = t;
        }
        public R getR() {
            return r;
        }
        public T getT() {
            return t;
        }
    }

    public static void main(String[] args) throws Exception {
        String str = "admin";
        String key = "zyqthezhangtong+";
        String encryptStr = encrypt(str, key);
        System.out.println(encryptStr);
        System.out.println(decrypt(encryptStr, key));

    }

}
