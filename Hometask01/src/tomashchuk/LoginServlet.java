package tomashchuk;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Вадим on 22.01.2017.
 */

@WebServlet("/")
public class LoginServlet extends HttpServlet {

    private static final String user1 = "Vadik";
    private static final String pass1 = "1";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        if (req.getParameter("Login").equals(user1) && req.getParameter("Pass").equals(pass1))
            resp.getWriter().append("<h3>Welcome!</h3>");
        else {
            req.setAttribute("error", "Invalid data! try again");
            req.getRequestDispatcher("index.jsp").forward(req, resp);

        }
    }

}