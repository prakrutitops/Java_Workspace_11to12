import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/send")
public class MyServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String n = req.getParameter("name");
		String p = req.getParameter("pass");
		
		if(p.equals("1234"))
		{
			out.print("Welcome "+n);
		}
		else
		{
			out.print("fail");
		}
				
		
		
		
		
	}
}
