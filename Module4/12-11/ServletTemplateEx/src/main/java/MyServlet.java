import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/abcd")
public class MyServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String fn = req.getParameter("firstname");
		String ln = req.getParameter("lastname");
		String cn = req.getParameter("country");
		String sub = req.getParameter("subject");
		
		out.print("Your Firstname is :"+fn);
		out.print("<br>");
		out.print("Your Lastname is :"+ln);
		out.print("<br>");
		out.print("Your Country is :"+cn);
		out.print("<br>");
		out.print("Your Subject is :"+sub);
		
		
	}
}
