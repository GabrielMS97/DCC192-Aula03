package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ice
 */
@WebServlet(name = "DivisaoServlet", urlPatterns = {"/divisao.html"})
public class DivisaoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Divisão </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Divisão </h1>");
        out.println("<form method='post'>");
        out.println("<form method='post'>");
        out.println("<label> X: <input name='X'/></label>");
        out.println("<label> Y: <input name='Y'/></label>");
        out.println("<input type='submit'/></label>");
        out.println("<input type='reset'/></label>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Integer X = Integer.valueOf(request.getParameter("X"));
            Integer Y = Integer.valueOf(request.getParameter("Y"));
            Integer D = X / Y;

            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Divisão </title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Divisão </h1>");
            out.println("<p> A divisão de X:"
                    + X + " por Y:"
                    + Y + " é "
                    + D + " </p>");
            out.println("<form method='post'>");
            out.println("<form method='post'>");
            out.println("<label> X: <input name='X'/></label>");
            out.println("<label> Y: <input name='Y'/></label>");
            out.println("<input type='submit'/></label>");
            out.println("<input type='reset'/></label>");
            out.println("</body>");
            out.println("</html>");
        } catch (NumberFormatException | ArithmeticException e) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Divisão </title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Divisão </h1>");
            out.println("<p> ERRO! </p>");
            out.println("<form method='post'>");
            out.println("<form method='post'>");
            out.println("<label> X: <input name='X'/></label>");
            out.println("<label> Y: <input name='Y'/></label>");
            out.println("<input type='submit'/></label>");
            out.println("<input type='reset'/></label>");
            out.println("</body>");
            out.println("</html>");
        }

    }

}
