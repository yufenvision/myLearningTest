package designmode.behavior_mode.chain_of_responsibility_pattern.my_filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/11/9 10:20
 */
public class Msg {
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }



}

interface Filter {

    boolean doFilter(Msg msg);
}

class FilterChian implements Filter {
    List<Filter> filterList = new ArrayList<>();

    public FilterChian add(Filter filter){
        filterList.add(filter);
        return this;
    }


    @Override
    public boolean doFilter(Msg msg) {
        for (Filter f : filterList) {
            if(!f.doFilter(msg))return false;
        }
        return true;
    }
}

class HTMLFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String m = msg.getMsg();
        msg.setMsg(m.replace("<","[").replace(">","]"));
        return true;
    }
}


class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String m = msg.getMsg();
        m = m.replace("996","955");
        boolean flag = !m.equals(msg.getMsg());
        msg.setMsg(m);
        return flag;
    }
}

class URLFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String m = msg.getMsg();
        msg.setMsg(m.replace("wwww","http://wwww"));
        return true;
    }
}

class FaceFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String m = msg.getMsg();
        msg.setMsg(m.replace("mashibing","java"));
        return true;
    }
}