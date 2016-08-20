package javax.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * @author Thomas Weckert
 */
@WebServlet(urlPatterns = { "/*" }, loadOnStartup = 1)
public class FunctionalServletWrapper extends HttpServlet {

	private static final long serialVersionUID = -2921458891058825871L;

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		
		FunctionalServlet.of((req, res) -> {
			res.getOutputStream().print("Hello, world");
			return true;
		}).service(request, response);
	}
	
}
