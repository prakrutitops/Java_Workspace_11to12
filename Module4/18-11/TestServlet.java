import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		

		HttpSession sess = req.getSession();
		
		if(sess.getAttribute("mysession")!=null)
		{
			resp.sendRedirect("DashboardServlet");
		}
		else
		{
			out.print("<a href='login.html'>Login</a>");
		}
	
		
	}
}
