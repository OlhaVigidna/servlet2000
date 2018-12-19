package handlers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = {"/", "/home"})
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET");
//        resp.setHeader("contentType", "text/html");
//        PrintWriter writer = resp.getWriter();
//        writer.println("<h1>hello!!!</h1>");
//        writer.close();

        String sex = req.getParameter("sex");
        String msg = req.getParameter("msg");
        req.setAttribute("sex", sex);
        req.setAttribute("msg", msg);
        req.getRequestDispatcher("template/index.jsp").forward(req, resp);
    }
}
