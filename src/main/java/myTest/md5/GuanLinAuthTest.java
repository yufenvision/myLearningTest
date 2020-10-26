package myTest.md5;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author: dyf
 * @Date: 2020/9/12 15:17
 * @Description:
 */
public class GuanLinAuthTest {
    public static final String BASIC_AUTH = "NDEwMTA6MTU5OTg4MTcwMzgyMzpBQkNDMzcxOTg0NzQ4NTIzNjk5OTA4M0E4QkFFRkRFODpDOTU3MEMyNzE0RUEzRDRDOjM=";

    public static void main(String[] args) throws IOException, JSONException {
        //一个appId和appSecret只能对应一个鉴权字符串
        String appId = "41010";
        String appSecret = "pp7oCReUTplYJkJNWsnbLg2S7OeLiMj8";
        String timestamp = String.valueOf(System.currentTimeMillis());
        String type = "3";

        //更新鉴权字符串，到常量字段BASIC_AUTH中
        getBasicAuth(appId,appSecret,timestamp,type);
    }

    public static String httpGet(String url, String authStr){
        String result = "";
        HttpGet get = new HttpGet(url);
        get.setHeader("Authorization", "Basic " + authStr);
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpResponse resp = httpclient.execute(get);
            if(resp.getStatusLine().getStatusCode() == HttpURLConnection.HTTP_OK){
                String strResp = EntityUtils.toString(resp.getEntity());
                JSONObject jsonObject = JSON.parseObject(strResp);
                JSONObject body = jsonObject.getJSONObject("body").getJSONObject("token");
                result = body.toString();
                System.out.println("token: " + result);
            }
            resp.getEntity();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }

    ////每个appId只能对应一个token,重新初始化后,之前的auth失效
    private static String getBasicAuth(String appId, String appSecret, String timestamp, String type) throws IOException, JSONException {
        String url = "http://yun.miligc.com/MLock/1.1/wuye/config";
        String token = "";
        String verify = timestamp + "|" + type + "|" + appSecret;
        verify = md5Encrypt(verify);
        String sb = appId + ":" + timestamp + ":" + verify + ":" + token + ":" + type;
        BASE64Encoder encoder = new BASE64Encoder();
        String encode = encoder.encode(sb.toString().getBytes());
        //第一次获取token
        token = httpGet(url, encode);
        String sb2 = appId + ":" + timestamp + ":" + verify + ":" + token + ":" + type;
        encode = encoder.encode(sb2.toString().getBytes());
        System.out.println("添加到鉴权常量字段BASIC_AUTH中:  " + encode);
        return encode;
    }


    static String md5Encrypt(String str){
        String result = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
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
//            System.out.println("MD5(" + str + ",32小写) = " + result);
//            System.out.println("MD5(" + str + ",32大写) = " + result.toUpperCase());
//            System.out.println("MD5(" + str + ",16小写) = " + buf.toString().substring(8, 24));
//            System.out.println("MD5(" + str + ",16大写) = " + buf.toString().substring(8, 24).toUpperCase());
            result = result.toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }
}
