package designmode.chain_of_responsibility_pattern.my_request_filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/11/9 10:20
 */
public class FilterTest {

    public static void main(String[] args) {
        Request request = new Request();
        Response response = new Response();

        FilterChian f1 = new FilterChian();
        f1.add(new HTMLFilter()).add(new SensitiveFilter()).add(new URLFilter()).add(new FaceFilter());
        f1.doFilter(request, response);
    }


}

class Request{
    String request;
}

class Response{
    String response;
}


interface Filter {

    void doFilter(Request request, Response response, FilterChian filterChian);
}

class FilterChian{
    private int index = 0;

    List<Filter> filterList = new ArrayList<>();

    public FilterChian add(Filter filter){
        filterList.add(filter);
        return this;
    }


    public void doFilter(Request request, Response response) {
//        // 所有过滤器执行完毕，return
//        if(index == filterList.size()){
//            return;
//        }
//        Filter filter = filterList.get(index);
//        // 自增操作不能和下面doFilter互换
//        index++;
//        filter.doFilter(request, response, this);

        //实现看tomcat的ApplicationFilterChain
        if(index < filterList.size()){
            Filter filter = filterList.get(index);
            // 自增操作不能和下面doFilter互换
            index++;
            filter.doFilter(request, response, this);
        }else {
            //执行servlet的service方法...
            System.out.println("执行servlet中service方法。。。。。。");
        }


    }
}

class HTMLFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChian filterChian) {
        System.out.println("HTMLFilter request");
        filterChian.doFilter(request, response);
        System.out.println("HTMLFilter response");
    }
}


class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChian filterChian) {
        System.out.println("SensitiveFilter request");
        filterChian.doFilter(request, response);
        System.out.println("SensitiveFilter response");
    }
}

class URLFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChian filterChian) {
        System.out.println("URLFilter request");
        filterChian.doFilter(request, response);
        System.out.println("URLFilter response");
    }
}

class FaceFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChian filterChian) {
        System.out.println("FaceFilter request");
        filterChian.doFilter(request, response);
        System.out.println("FaceFilter response");
    }
}