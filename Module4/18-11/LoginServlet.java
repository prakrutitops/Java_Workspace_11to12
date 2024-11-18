import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/send")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		
		HttpSession sess = req.getSession();
		
		String e = req.getParameter("email");
		String p = req.getParameter("pass");
		
		if(p.equals("1234"))
		{
				sess.setAttribute("mysession",true);
				sess.setAttribute("myemail", e);
				resp.sendRedirect("DashboardServlet");
		}
		else
		{
				out.print("Login Fail");
		}
		
		
	}
}
