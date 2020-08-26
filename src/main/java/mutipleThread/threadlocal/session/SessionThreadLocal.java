package mutipleThread.threadlocal.session;

import lombok.Data;

/**
 * @Author: dyf
 * @Date: 2020/8/26 15:54
 * @Description:
 */
public class SessionThreadLocal {
    public static ThreadLocal<Session> session = ThreadLocal.<Session>withInitial(() -> new Session());

    @Data
    public static class Session {
        private String id;
        private String user;
        private String status;
    }

    public String getUser() {
        return session.get().getUser();
    }

    public String getStatus() {
        return session.get().getStatus();
    }

    public void setStatus(String status) {
        session.get().setStatus(status);
    }

    public static void main(String[] args) {
        new Thread(() -> {
            SessionThreadLocal handler = new SessionThreadLocal();
            handler.getStatus();
            handler.getUser();
            handler.setStatus("close");
            handler.getStatus();
        }).start();
    }

    /*
    使用 ThreadLocal 改造后的代码，不再需要在各个方法间传递 Session 对象，并且也非常轻松的保证了每个线程拥有自己独立的实例。
    如果单看其中某一点，替代方法很多。比如可通过在线程内创建局部变量可实现每个线程有自己的实例，使用静态变量可实现变量在方法间的共享。但如果要同时满足变量在线程间的隔离与方法间的共享，ThreadLocal再合适不过。
     */

}
