import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.*;
public class Servlet2 extends HttpServlet{

    public void doGet(HttpServletRequest rq, HttpServletResponse rs) throws IOException{

        HttpSession ses = rq.getSession(false);

        PrintWriter pw = rs.getWriter();
        pw.println("<h1>"+ses.getAttribute("uname")+"</h1>");

    }

}
