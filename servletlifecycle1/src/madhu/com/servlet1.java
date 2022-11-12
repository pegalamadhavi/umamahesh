package madhu.com;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public servlet1() {
    System.out.println("constructor");    
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
	}

	
	public void destroy() {
	System.out.println("destroy");	
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("processing the request and response");
		
	}

}
