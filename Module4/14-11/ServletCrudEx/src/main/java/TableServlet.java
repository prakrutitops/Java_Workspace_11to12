
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/TableServlet")
public class TableServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            // HTML content
            out.println("<!DOCTYPE html>");
            out.println("<html lang='en'>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("<title>Fixed Table Header</title>");
            out.println("<style>");
            out.println("h1 { font-size: 30px; color: #fff; text-transform: uppercase; font-weight: 300; text-align: center; margin-bottom: 15px; }");
            out.println("table { width: 100%; table-layout: fixed; }");
            out.println(".tbl-header { background-color: rgba(255,255,255,0.3); }");
            out.println(".tbl-content { height: 300px; overflow-x: auto; margin-top: 0px; border: 1px solid rgba(255,255,255,0.3); }");
            out.println("th { padding: 20px 15px; text-align: left; font-weight: 500; font-size: 12px; color: #fff; text-transform: uppercase; }");
            out.println("td { padding: 15px; text-align: left; vertical-align: middle; font-weight: 300; font-size: 12px; color: #fff; border-bottom: solid 1px rgba(255,255,255,0.1); }");
            out.println("@import url('https://fonts.googleapis.com/css?family=Roboto:400,500,300,700');");
            out.println("body { background: linear-gradient(to right, #25c481, #25b7c4); font-family: 'Roboto', sans-serif; }");
            out.println("section { margin: 50px; }");
            out.println(".made-with-love { margin-top: 40px; padding: 10px; text-align: center; font-size: 10px; font-family: arial; color: #fff; }");
            out.println(".made-with-love i { font-style: normal; color: #F50057; font-size: 14px; position: relative; top: 2px; }");
            out.println(".made-with-love a { color: #fff; text-decoration: none; }");
            out.println(".made-with-love a:hover { text-decoration: underline; }");
            out.println("::-webkit-scrollbar { width: 6px; }");
            out.println("::-webkit-scrollbar-track { -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); }");
            out.println("::-webkit-scrollbar-thumb { -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");

            // Section for the fixed table header
            out.println("<section>");
            out.println("<h1>Fixed Table Header</h1>");
            out.println("<div class='tbl-header'>");
            out.println("<table cellpadding='0' cellspacing='0' border='0'>");
            out.println("<thead>");
            out.println("<tr><th>Code</th><th>Company</th><th>Price</th><th>Change</th><th>Change %</th></tr>");
            out.println("</thead>");
            out.println("</table>");
            out.println("</div>");
            out.println("<div class='tbl-content'>");
            out.println("<table cellpadding='0' cellspacing='0' border='0'>");
            out.println("<tbody>");

            // Table data rows
            String[][] data = {
                {"AAC", "AUSTRALIAN COMPANY", "$1.38", "+2.01", "-0.36%"},
                {"AAD", "AUSENCO", "$2.38", "-0.01", "-1.36%"},
                {"AAX", "ADELAIDE", "$3.22", "+0.01", "+1.36%"},
                {"XXD", "ADITYA BIRLA", "$1.02", "-1.01", "+2.36%"}
                // Add as many rows as necessary...
            };

            for (String[] row : data) {
                out.println("<tr>");
                for (String cell : row) {
                    out.println("<td>" + cell + "</td>");
                }
                out.println("</tr>");
            }

            out.println("</tbody>");
            out.println("</table>");
            out.println("</div>");
            out.println("</section>");

            // Follow me section
            out.println("<div class='made-with-love'>");
            out.println("Made with <i>♥</i> by <a target='_blank' href='https://codepen.io/nikhil8krishnan'>Nikhil Krishnan</a>");
            out.println("</div>");

            // JS for handling table scroll width adjustment
            out.println("<script src='https://code.jquery.com/jquery-3.6.0.min.js'></script>");
            out.println("<script>");
            out.println("$(window).on('load resize', function() {");
            out.println("  var scrollWidth = $('.tbl-content').width() - $('.tbl-content table').width();");
            out.println("  $('.tbl-header').css({'padding-right': scrollWidth});");
            out.println("}).resize();");
            out.println("</script>");

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}
