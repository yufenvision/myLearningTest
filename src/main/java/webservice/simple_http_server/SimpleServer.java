package webservice.simple_http_server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

/**
 * @Description:
 * 使用Java技术构建Web应用时， 我们通常离不开tomcat和jetty之类的servlet容器，这些Web服务器功能强大，性能强劲，深受欢迎，是运行大型Web应用的必备神器。
 *
 * 虽然Java的设计初衷就是用来开发大型应用的，然而有时候我们开发的程序只是简单的小型应用，对于功能的需求和性能的要求并不高，可能仅仅就几百行甚至几十行代码，
 * 这个时候使用tomcat之类的Web服务器去运行就显得有点大材小用了。
 * 比如说只是将数据库中的数据读出来转换成JSON，以Web服务的形式吐给调用方这样的阉割型Web应用。
 *
 * @Author: dyf
 * @Date: 2021/4/9 17:23
 */
public class SimpleServer {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8001), 0);
        server.createContext("/test", new TestHandler());
        server.start();

    }

    static class TestHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException{
            String response = "hello world";
            exchange.sendResponseHeaders(200, 0);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}
