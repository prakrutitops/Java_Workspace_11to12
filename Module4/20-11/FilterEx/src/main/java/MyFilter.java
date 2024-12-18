
/*
Filter is server side java class 
Filter is used to do filtering task (server side validation) 

for example, input validation, data compression etc...

doFilter
	we havet to write validation logic here
	
Control : View to Filter to Controller to Model 	
*/
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/servlet1")
public class MyFilter implements Filter {

   
    public MyFilter() {
        // TODO Auto-generated constructor stub
    }


	public void destroy() {
		// TODO Auto-generated method stub
		
		System.out.println("Destroy Method Called!");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String pass = request.getParameter("pass");
		
		if(name.equalsIgnoreCase("")||email.equalsIgnoreCase("")||mobile.equalsIgnoreCase("")||pass.equalsIgnoreCase("")) {
			
			out.println("All fields are mandetary");
			//request.getRequestDispatcher("index.jsp").include(request, response);
			request.getRequestDispatcher("index.html").include(request, response);
		}
		else if(name.equalsIgnoreCase(null)||email.equalsIgnoreCase(null)||mobile.equalsIgnoreCase(null)||pass.equalsIgnoreCase(null)){
			
			out.println("Fields are not  getting value ");
			request.getRequestDispatcher("index.html").include(request, response);
			//request.getRequestDispatcher("index.jsp").include(request, response);
		}
		else if(pass.equals("admin")) 
		{
			chain.doFilter(request, response);
			
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		
		System.out.println("INIT Method Called!");
	}

}
