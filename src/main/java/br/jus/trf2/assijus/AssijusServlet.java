package br.jus.trf2.assijus;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crivano.swaggerservlet.Swagger;
import com.crivano.swaggerservlet.SwaggerServlet;

public class AssijusServlet extends SwaggerServlet {
	private static final long serialVersionUID = 1756711359239182178L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		super.setActionPackage("br.jus.trf2.assijus");

		Swagger sw = new Swagger();
		sw.loadFromInputStream(this.getClass().getResourceAsStream(
				"/swagger.yaml"));

		super.setSwagger(sw);
	}

	@Override
	protected String getService() {
		return "assijus";
	}
}
