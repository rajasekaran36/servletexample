import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionMonitor implements HttpSessionListener{
    public static int total=0,cur=0;
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session Created");
        total++;
        System.out.println(total);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session Destroyed");
    }
}