package rsa;

import sun.misc.BASE64Decoder;

import javax.crypto.Cipher;
import java.io.*;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.*;
import java.util.*;

/**
 * @Author: dyf
 * @Date: 2019/10/17 10:04
 * @Description:
 */
public class RSAUtil {
    private static Map<Integer, String> keyMap = new HashMap<Integer, String>();  //用于封装随机产生的公钥与私钥

    //存取外部,私钥
    private RSAPrivateKey privateKey;
    //存取外部,公钥
    private RSAPublicKey publicKey;

    public static void main(String[] args) throws Exception {
        //生成公钥和私钥
        genKeyPair();
        //加密字符串
        String message = "Pass@2018";
        System.out.println("随机生成的公钥为:" + keyMap.get(0));
        System.out.println("随机生成的私钥为:" + keyMap.get(1));
        String messageEncode = encrypt(message,keyMap.get(0));
        System.out.println(message + "\t加密后的字符串为:" + messageEncode);
        String messageDecode = decrypt(messageEncode,keyMap.get(1));
        System.out.println("还原后的字符串为:" + messageDecode);

        String publicKeyStr = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCmWaD9O2JBxswtqDRezaDfIqB9kESDNQR6aamftAhRaP4P50qhB8YIy+Scbl1CiFWi9XHlbocDF+5E37eN7RmDTXBP6k2iKm7nXDllw/7++ET5MKs8tqMHuvTcq7eUgnozrG+mY9tJvbmZgQcfiFSLqyH6lqWiPLW8APd3pzicKwIDAQAB";
        String privateKetStr = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAKZZoP07YkHGzC2oNF7NoN8ioH2QRIM1BHppqZ+0CFFo/g/nSqEHxgjL5JxuXUKIVaL1ceVuhwMX7kTft43tGYNNcE/qTaIqbudcOWXD/v74RPkwqzy2owe69Nyrt5SCejOsb6Zj20m9uZmBBx+IVIurIfqWpaI8tbwA93enOJwrAgMBAAECgYAvrRp92Wo0zeQw5bd0wFxt9z+mHRX1wNkyuFvcIL4NjxjZuAFkm5S/aqhvyRXDfs2EcfIdvorFcTNh2/iAncakq9xoLyIKipF2KP4ZMl8YAMINdXPWOWrg7NP61VzJ30FjMfUxhEiRnJzEEXyl1m4mQdEhnV3wA9EZTYXC++ItSQJBANGL0S8tkJY01KCcwxb2kBszcokZiWfMP6r21JxLgqBLBbpzqrJDpWo5AyKA0PBVBLLAGNGU4qEJfUGsPt1howUCQQDLOlh+R+JpxXpSxXrirJDwXepfpJ9S6arG6b3z7FwUwl7JwkGlivfRLGBB3bGmmGlvl8sxW0810bXmb7palMlvAkEAxe++r0PpOhm5Z+XsWrqZMTiNzney1buXwJTcDK8/Os7jIFa2PSGtFQO5tFPeCcclYvwV9ZMf6GIgUXK1B0V9SQJAWYMvax+6aCAlCsQUpjaf+F9FVi8qRdjJ8acOlZuryzD5kyBOzd1x3d4P37MIBnrnJdHUG78+GlRuLDtV94PFXQJBAMEAxX/PR7EC93kG4ww1FgBSI1JF/pD1y/nlKoQxfbKqsswG0zMW/sRt6eGL4tgLW8bdpK6nGUQhTZmdqmpDE5k=";
        String messageEn = encrypt(message, publicKeyStr);
        System.out.println(message + "\t加密后的字符串为:" + messageEn);
        String messageDe = decrypt(messageEn, privateKetStr);
        System.out.println("还原后的字符串为:" + messageDe);

        //解密来自前端的密码
        String pswFromWeb = "EXpVZkMGQ4slQKOM/53+WQPGKKMF9Yqc2JbAUgs8U+4LHgwKFikhW5M+m5SzFvTR3HoRJ9PZRKYbBc1D8QdY39by0YbQD3ktntzjJYzULsvVDfD+PQVU73hqXlHFt0cIp1nPCaplN0soQkpbQ8N1AZLdtRFpT5OjWyabe/TNbgA=";
        System.out.println("解密前端密码为：" + decrypt(pswFromWeb, privateKetStr));

        //根据IOS端提供的公钥，私钥来解密
        String basePath = RSAUtil.class.getResource("/").getPath();
        String publicKeyPath = basePath + "/rsa/rsa_public_key.pem";        // replace your public key path here
        String privateKeyPath = basePath + "/rsa/pkcs8_private_key.pem";     // replace your private path here
        String rsaBase46StringFromIOS = "h9Sunsga1YtCBCRmLoA1WJ/SZOtDJuwfTTzIrZx1qx977Y2UD7OKU4Hu9h1gzgNtGzUWP1enTdUERPbCCAeQ1w+JrB4/R/yfLTIeO/8jXoQHfv1ZIDcVkQfJRo+AZo5N/eHES7bBcYvXglKSp9C/urYtrTL/WepOXGu8Dy85sH0=";
        String privateKeyStrIOS = getKeyFromFile(privateKeyPath);
        System.out.println(RSAUtil.decryptIOS(rsaBase46StringFromIOS, privateKeyStrIOS));
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

    public static String decryptIOS(String decodeStr, String privateKeyStr) throws Exception{
        //64位解码加密后的字符串
        byte[] inputByte = Base64.getDecoder().decode(decodeStr.getBytes("UTF-8"));
        //base64编码的私钥
        byte[] decoded = new BASE64Decoder().decodeBuffer(privateKeyStr);//不知道为什么，这里只有用sum.misc的base64解码，不会报错
        RSAPrivateKey priKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(decoded));
        //RSA解密
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, priKey);
        String outStr = new String(cipher.doFinal(inputByte));
        return outStr;
    }

    public static String getKeyFromFile(String filePath) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line = null;
        List<String> list = new ArrayList<String>();
        while ((line = bufferedReader.readLine()) != null){
            list.add(line);
        }

        // remove the firt line and last line
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < list.size() - 1; i++) {
            stringBuilder.append(list.get(i)).append("\r");
        }

        String key = stringBuilder.toString();
        return key;
    }

    /**
     * 从字符串中加载公钥
     * @param publicKeyStr 公钥数据字符串
     * @throws Exception 加载公钥时产生的异常
     */
    public void loadPublicKey(String publicKeyStr) throws Exception{
        byte[] buffer= Base64.getDecoder().decode(publicKeyStr);
        KeyFactory keyFactory= KeyFactory.getInstance("RSA");
        X509EncodedKeySpec keySpec= new X509EncodedKeySpec(buffer);
        this.publicKey= (RSAPublicKey) keyFactory.generatePublic(keySpec);
    }


    public void loadPrivateKey(String privateKeyStr) throws Exception{
        byte[] buffer= Base64.getDecoder().decode(privateKeyStr);
        PKCS8EncodedKeySpec keySpec= new PKCS8EncodedKeySpec(buffer);
        KeyFactory keyFactory= KeyFactory.getInstance("RSA");
        this.privateKey= (RSAPrivateKey) keyFactory.generatePrivate(keySpec);
    }

    /**
     * 字节数据转字符串专用集合
     */
    private static final char[] HEX_CHAR= {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /**
     * 字节数据转十六进制字符串
     * @param data 输入数据
     * @return 十六进制内容
     */
    public static String byteArrayToString(byte[] data){
        StringBuilder stringBuilder= new StringBuilder();
        for (int i=0; i<data.length; i++){
            //取出字节的高四位 作为索引得到相应的十六进制标识符 注意无符号右移
            stringBuilder.append(HEX_CHAR[(data[i] & 0xf0)>>> 4]);
            //取出字节的低四位 作为索引得到相应的十六进制标识符
            stringBuilder.append(HEX_CHAR[(data[i] & 0x0f)]);
            if (i<data.length-1){
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();
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
