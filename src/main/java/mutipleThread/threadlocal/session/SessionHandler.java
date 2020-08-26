package mutipleThread.threadlocal.session;

import lombok.Data;

/**
 * @Author: dyf
 * @Date: 2020/8/26 15:32
 * @Description:
 */
public class SessionHandler {

    @Data
    public static class Session{
        private String id;
        private String user;
        private String status;
    }

    public Session createSession(){
        return new Session();
    }

    public String getUser(Session session) {
        return session.getUser();
    }

    public String getStatus(Session session) {
        return session.getStatus();
    }

    public void setStatus(Session session, String status) {
        session.setStatus(status);
    }

    public static void main(String[] args) {
        new Thread(() -> {
            SessionHandler handler = new SessionHandler();
            Session session = handler.createSession();
            handler.getStatus(session);
            handler.getUser(session);
            handler.setStatus(session, "close");
            handler.getStatus(session);
        }).start();
    }
    //该方法是可以实现需求的。但是每个需要使用 Session 的地方，都需要显式传递 Session 对象，方法间耦合度较高。

}
