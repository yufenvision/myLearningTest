package myTest.md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author: dyf
 * @Date: 2020/9/11 16:15
 * @Description:
 */
public class MD5Test {
    public static void main(String[] args){
        String verify1 = "1599809282|3|pp7oCReUTplYJkJNWsnbLg2S7OeLiMj8";//D38E8EDEA910FE4E902F7148F9B8799C
        String result = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(verify1.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            result = buf.toString();
            System.out.println("MD5(" + verify1 + ",32小写) = " + result);
            System.out.println("MD5(" + verify1 + ",32大写) = " + result.toUpperCase());
            System.out.println("MD5(" + verify1 + ",16小写) = " + buf.toString().substring(8, 24));
            System.out.println("MD5(" + verify1 + ",16大写) = " + buf.toString().substring(8, 24).toUpperCase());


        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }



    }

}
