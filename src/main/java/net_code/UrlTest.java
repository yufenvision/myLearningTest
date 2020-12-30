package net_code;

import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/12/10 15:27
 */
@Slf4j
public class UrlTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        String imgUrl = "https://yibinpt.91-ec.com:31043/aaa/faceImage/20201207/76ff9053-3706-492b-ba07-73bec82e03a2.jpeg";
        String imgUrl = "http://ybxq.horsentwise.com/static/faceImage/2020/11/27/5ce27fa4-37e6-4d16-90be-06be996687c1.jpeg";
        try {
            URL url = new URL(imgUrl);
            URLConnection uc = url.openConnection();
            InputStream in = uc.getInputStream();
            if (imgUrl.equalsIgnoreCase(uc.getURL().toString())) {
                log.info("图片存在：{}", imgUrl);
            }
            in.close();
        }catch(Exception e){

        }

//        try {
//            URL url = new URL(imgUrl);
//            URLConnection uc = url.openConnection();
//            if (((HttpURLConnection)uc).getResponseCode() == 200) {
//                log.info("图片存在：{}", imgUrl);
//            }
//        }catch(Exception e){
//
//        }

        log.info("耗时：{} 毫秒", System.currentTimeMillis() - start);


        try {
            URL url = new URL("https://www.sojson.com/open/api/weather/json.shtml?city=成都");
            System.out.println("URL 为：" + url.toString());
            System.out.println("协议为：" + url.getProtocol());
            System.out.println("验证信息：" + url.getAuthority());
            System.out.println("文件名及请求参数：" + url.getFile());
            System.out.println("主机名：" + url.getHost());
            System.out.println("路径：" + url.getPath());
            System.out.println("端口：" + url.getPort());
            System.out.println("默认端口：" + url.getDefaultPort());
            System.out.println("请求参数：" + url.getQuery());
            System.out.println("定位位置：" + url.getRef());
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
