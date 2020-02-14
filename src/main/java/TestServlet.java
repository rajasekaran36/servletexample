import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class TestServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        rs.setContentType("text/html");
        PrintWriter pw = rs.getWriter();
        String userName = rq.getParameter("name");

        HttpSession s = rq.getSession();
        s.setAttribute("uname", userName);
        System.out.println(s.getId());
        long ms = s.getCreationTime();
        Date d = new Date(ms);
        System.out.println(d.toString());
        s.setMaxInactiveInterval(5);
        System.out.println(s.getLastAccessedTime());
        pw.println("<a href='/serv2'>go</a>");
    }
}
