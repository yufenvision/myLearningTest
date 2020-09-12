import myTest.md5.MD5Utils;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.function.Consumer;

/**
 * @Author: dyf
 * @Date: 2020/9/1 11:26
 * @Description:
 */
public class TempTest {



    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        String appId = "41010";
        String appSecret = "pp7oCReUTplYJkJNWsnbLg2S7OeLiMj8";
        String timestamp = String.valueOf(System.currentTimeMillis());
        String type = "3";
        String token = "";
        String verify = timestamp + "|" + type + "|" + appSecret;

        verify = MD5Utils.getMD5String(verify);

        StringBuilder sb = new StringBuilder();
        sb.append(appId)
                .append(":").append(timestamp)
                .append(":").append(verify)
//                .append(":").append("")
                .append(":").append("C9570C2714EA3D4C")
                .append(":").append(type);

        System.out.println(sb.toString());
        BASE64Encoder encoder = new BASE64Encoder();
        BASE64Decoder decoder = new BASE64Decoder();

        String encode = encoder.encode(sb.toString().getBytes());
        System.out.println(encode);

        System.out.println(new String(decoder.decodeBuffer("NDEwMTA6MTU5OTg4MTY3ODY5NDpEMjE2NUQ2Rjk1QjgzNUFGMTNDNUExQUNFMkU0QjQzQzp7InRva2VuIjoiQzk1NzBDMjcxNEVBM0Q0QyJ9OjM=")));
        System.out.println(new String(decoder.decodeBuffer("NDEwMTA6MTU5OTg4MTcwMzgyMzpBQkNDMzcxOTg0NzQ4NTIzNjk5OTA4M0E4QkFFRkRFODpDOTU3MEMyNzE0RUEzRDRDOjM=")));
    }

}
