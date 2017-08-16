package ua.kiev.prog.question;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by Вадим on 16.08.2017.
 */
@WebServlet(urlPatterns = "/")
public class MainServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/index.jsp");
    }
}
