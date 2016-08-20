package javax.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author Thomas Weckert
 */
@FunctionalInterface
public interface FunctionalServiceCall {

	boolean call(ServletRequest req, ServletResponse res)
			throws ServletException, IOException;

}
