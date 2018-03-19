
import br.ufjf.dcc192.*;
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
@WebServlet(name = "ContadorServlet", urlPatterns = {"/contador.html"})
public class ContadorServlet extends HttpServlet {

    private static int c = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String comando = request.getParameter("comando");
        if ("inc".equalsIgnoreCase(comando)) {
            c++;
        } else if ("dec".equalsIgnoreCase(comando)) {
            c--;
        }

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Contador </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Contador </h1>");
        out.println("<p> Valor atual do Contador: "
                + c + " </p>");
        out.println("<p> <a href = '?comando=inc'> Incrementar </a> </p>");
        out.println("<p> <a href = '?comando=dec'> Decrementar </a> </p>");
        out.println("<p> <a href = 'index.html'> Início </a> </p>");
        out.println("</body>");
        out.println("</html>");
    }

}
