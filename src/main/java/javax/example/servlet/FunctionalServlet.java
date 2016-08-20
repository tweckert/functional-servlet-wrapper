package javax.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

/**
 * @author Thomas Weckert
 */
public class FunctionalServlet extends HttpServlet {

	private static final long serialVersionUID = 6257886675318655461L;

	private final FunctionalServiceCall serviceHandle;

	public static FunctionalServlet of(final FunctionalServiceCall call) {
		return new FunctionalServlet(call);
	}

	public FunctionalServlet(final FunctionalServiceCall serviceHandle) {
		this.serviceHandle = serviceHandle;
	}

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		serviceHandle.call(request, response);
	}

}
