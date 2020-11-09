package designmode.ChainOfResponsibilityPattern.my_filter;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/11/9 10:15
 */
public class FilterTest {
    public static void main(String[] args) {
        Msg msg = new Msg();
        String m = "<script>欢迎来到 wwww.mashibing.com,大家都是996";
        msg.setMsg(m);
        FilterChian fc1 = new FilterChian();
        fc1.add(new HTMLFilter()).add(new SensitiveFilter());

//        fc1.doFilter(msg);
        System.out.println(msg.getMsg());

        FilterChian fc2 = new FilterChian();
        fc2.add(new FaceFilter()).add(new URLFilter());

        fc1.add(fc2);
        fc1.doFilter(msg);
        System.out.println(msg.getMsg());


    }
}
