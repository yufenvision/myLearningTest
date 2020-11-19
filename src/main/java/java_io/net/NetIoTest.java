package java_io.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * @Author: dyf
 * @Date: 2020/11/19 23:36
 * @Description:
 */
public class NetIoTest {
    public static void main(String[] args) throws IOException {
        System.out.println(InetAddress.getByName("192.168.101.8"));

        URL url = new URL("http://t.weather.itboy.net/api/weather/city/101270101");//成都
        //101271401乐山

        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
        String line;
        while((line = reader.readLine()) !=null){
            System.out.println(line);
        }
        reader.close();
    }

}
