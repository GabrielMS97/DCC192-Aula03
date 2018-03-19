package br.ufjf.dcc192;

import br.ufjf.dcc192.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ice
 */
@WebServlet(name = "TODOServlet", urlPatterns = {"/TODO.html"})
public class TODOServlet extends HttpServlet {
   
    private static List<String> todos = new ArrayList<String>(){{
        add("Estudar Java");
        add("Estudar HTML");
        add("Estudar JS");
    }};

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title> TODO List </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> TODO List </h1>");
        out.println("<form method='post'>");
        out.println("<label>Atividade<input name='atividade'/></label>");
        out.println("<input type='submit'/>");
        out.println("<input type='reset'/>");
        out.println("</form>");
        out.println("<ul>");
        for (String todo : todos) {
            out.println("<li>" + todo + "</li>");
        }
        out.println("</ul>");
        out.println("<p> <a href = 'index.html'> Início </a> </p>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String atividade = request.getParameter("atividade");
        todos.add(atividade);
        response.sendRedirect("TODO.html");
    }
    
    
    
}
