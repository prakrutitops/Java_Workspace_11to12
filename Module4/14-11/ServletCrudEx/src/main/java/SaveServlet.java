import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class SaveServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		
		Model m = new Model();
		m.setName(name);
		m.setSurname(surname);
		m.setEmail(email);
		m.setPassword(pass);
		
		int status = Dao.insertdata(m);
		
		if(status>0)
		{
			resp.sendRedirect("ViewServlet");
		}
		else
		{
			out.print("fail");
		}
		
		
	}
}
