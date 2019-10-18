package rsa;

import javax.crypto.Cipher;
import java.math.BigInteger;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: dyf
 * @Date: 2019/10/17 10:04
 * @Description:
 */
public class RSAUtil {
    private static Map<Integer, String> keyMap = new HashMap<Integer, String>();  //用于封装随机产生的公钥与私钥
    public static void main(String[] args) throws Exception {
        //生成公钥和私钥
        genKeyPair();
        //加密字符串
        String message = "Pass@2018";
//        System.out.println("随机生成的公钥为:" + keyMap.get(0));
//        System.out.println("随机生成的私钥为:" + keyMap.get(1));
//        String messageEn = encrypt(message,keyMap.get(0));
//        System.out.println(message + "\t加密后的字符串为:" + messageEn);
//        String messageDe = decrypt(messageEn,keyMap.get(1));
//        System.out.println("还原后的字符串为:" + messageDe);
        String publicKeyStr = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCmWaD9O2JBxswtqDRezaDfIqB9kESDNQR6aamftAhRaP4P50qhB8YIy+Scbl1CiFWi9XHlbocDF+5E37eN7RmDTXBP6k2iKm7nXDllw/7++ET5MKs8tqMHuvTcq7eUgnozrG+mY9tJvbmZgQcfiFSLqyH6lqWiPLW8APd3pzicKwIDAQAB";
        String privateKetStr = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAKZZoP07YkHGzC2oNF7NoN8ioH2QRIM1BHppqZ+0CFFo/g/nSqEHxgjL5JxuXUKIVaL1ceVuhwMX7kTft43tGYNNcE/qTaIqbudcOWXD/v74RPkwqzy2owe69Nyrt5SCejOsb6Zj20m9uZmBBx+IVIurIfqWpaI8tbwA93enOJwrAgMBAAECgYAvrRp92Wo0zeQw5bd0wFxt9z+mHRX1wNkyuFvcIL4NjxjZuAFkm5S/aqhvyRXDfs2EcfIdvorFcTNh2/iAncakq9xoLyIKipF2KP4ZMl8YAMINdXPWOWrg7NP61VzJ30FjMfUxhEiRnJzEEXyl1m4mQdEhnV3wA9EZTYXC++ItSQJBANGL0S8tkJY01KCcwxb2kBszcokZiWfMP6r21JxLgqBLBbpzqrJDpWo5AyKA0PBVBLLAGNGU4qEJfUGsPt1howUCQQDLOlh+R+JpxXpSxXrirJDwXepfpJ9S6arG6b3z7FwUwl7JwkGlivfRLGBB3bGmmGlvl8sxW0810bXmb7palMlvAkEAxe++r0PpOhm5Z+XsWrqZMTiNzney1buXwJTcDK8/Os7jIFa2PSGtFQO5tFPeCcclYvwV9ZMf6GIgUXK1B0V9SQJAWYMvax+6aCAlCsQUpjaf+F9FVi8qRdjJ8acOlZuryzD5kyBOzd1x3d4P37MIBnrnJdHUG78+GlRuLDtV94PFXQJBAMEAxX/PR7EC93kG4ww1FgBSI1JF/pD1y/nlKoQxfbKqsswG0zMW/sRt6eGL4tgLW8bdpK6nGUQhTZmdqmpDE5k=";
        String messageEn = encrypt(message, publicKeyStr);
        System.out.println(message + "\t加密后的字符串为:" + messageEn);
        String messageDe = decrypt(messageEn, privateKetStr);
        System.out.println("还原后的字符串为:" + messageDe);

        String pswFromWeb = "EXpVZkMGQ4slQKOM/53+WQPGKKMF9Yqc2JbAUgs8U+4LHgwKFikhW5M+m5SzFvTR3HoRJ9PZRKYbBc1D8QdY39by0YbQD3ktntzjJYzULsvVDfD+PQVU73hqXlHFt0cIp1nPCaplN0soQkpbQ8N1AZLdtRFpT5OjWyabe/TNbgA=";
        System.out.println("解密前端密码为：" + decrypt(pswFromWeb, privateKetStr));
    }

    /**
     * 随机生成密钥对
     * @throws NoSuchAlgorithmException
     */
    public static void genKeyPair() throws NoSuchAlgorithmException {
        // KeyPairGenerator类用于生成公钥和私钥对，基于RSA算法生成对象
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        // 初始化密钥对生成器，密钥大小为96-1024位
        keyPairGen.initialize(1024,new SecureRandom());
        // 生成一个密钥对，保存在keyPair中
        KeyPair keyPair = keyPairGen.generateKeyPair();
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();   // 得到私钥
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();  // 得到公钥
        String publicKeyString = Base64.getEncoder().encodeToString(publicKey.getEncoded());
        // 得到私钥字符串
        String privateKeyString = Base64.getEncoder().encodeToString(privateKey.getEncoded());
        // 将公钥和私钥保存到Map
        keyMap.put(0,publicKeyString);  //0表示公钥
        keyMap.put(1,privateKeyString);  //1表示私钥
    }
    /**
     * RSA公钥加密
     *
     * @param encodeStr
     *            加密字符串
     * @param publicKeyStr
     *            公钥
     * @return 密文
     * @throws Exception
     *             加密过程中的异常信息
     */
    public static String encrypt( String encodeStr, String publicKeyStr ) throws Exception{
        //base64编码的公钥
        byte[] decoded = Base64.getDecoder().decode(publicKeyStr);
        RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decoded));
        //RSA加密
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
        String outStr = Base64.getEncoder().encodeToString(cipher.doFinal(encodeStr.getBytes("UTF-8")));
        return outStr;
    }

    /**
     * RSA私钥解密
     *
     * @param decodeStr
     *            加密字符串
     * @param privateKeyStr
     *            私钥
     * @return 铭文
     * @throws Exception
     *             解密过程中的异常信息
     */
    public static String decrypt(String decodeStr, String privateKeyStr) throws Exception{
        //64位解码加密后的字符串
        byte[] inputByte = Base64.getDecoder().decode(decodeStr.getBytes("UTF-8"));
        //base64编码的私钥
        byte[] decoded = Base64.getDecoder().decode(privateKeyStr);
        RSAPrivateKey priKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(decoded));
        //RSA解密
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, priKey);
        String outStr = new String(cipher.doFinal(inputByte));
        return outStr;
    }


    /**
    * 根据指定私钥对数据进行签名(默认签名算法为"SHA1withRSA")
    *
    * @param data 要签名的数据
    * @param priKey 私钥
    * @return
    */
    public static byte[] signData(byte[] data, PrivateKey priKey) {
        return signData(data, priKey, "SHA1withRSA");
    }

    /**
     * 根据指定私钥和算法对数据进行签名
     *
     * @param data 要签名的数据
     * @param priKey 私钥
     * @param algorithm 签名算法
     * @return
     */
    public static byte[] signData(byte[] data, PrivateKey priKey,
                                  String algorithm) {
        try {
            Signature signature = Signature.getInstance(algorithm);
            signature.initSign(priKey);
            signature.update(data);
            return signature.sign();
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * 用指定的公钥进行签名验证(默认签名算法为"SHA1withRSA")
     *
     * @param data 数据
     * @param sign 签名结果
     * @param pubKey 公钥
     * @return
     */
    public static boolean verifySign(byte[] data, byte[] sign, PublicKey pubKey) {
        return verifySign(data, sign, pubKey, "SHA1withRSA");
    }

    /**
     *
     * @param data  数据
     * @param sign 签名结果
     * @param pubKey 公钥
     * @param algorithm 签名算法
     * @return
     */
    public static boolean verifySign(byte[] data, byte[] sign, PublicKey pubKey, String algorithm) {
        try {
            Signature signature = Signature.getInstance(algorithm);
            signature.initVerify(pubKey);
            signature.update(data);
            return signature.verify(sign);
        } catch (Exception ex) {
            return false;
        }
    }
}
