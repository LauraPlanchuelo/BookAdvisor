package com.bookadvisor.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookadvisor.dao.LectorDAOImplementation;
import com.bookadvisor.dao.LibreriaDAOImplementation;
import com.bookadvisor.dao.model.Lector;
import com.bookadvisor.dao.model.Libreria;

@WebServlet ("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private final String ADMIN_EMAIL = "root";
	private final String ADMIN_PASSWORD = "root";

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");
		Lector lector = LectorDAOImplementation.getInstance().login(email, password);
		Libreria libreria = LibreriaDAOImplementation.getInstance().login(email, password);

		if (ADMIN_EMAIL.equals(email) && ADMIN_PASSWORD.equals(password) ) {
			req.getSession().setAttribute("lector_list", LectorDAOImplementation.getInstance().getAll());
			resp.sendRedirect(req.getContextPath() + "/LoginSecretaria.jsp");
		} else if (null != lector) {
			req.getSession().setAttribute("lector", lector);
			resp.sendRedirect(req.getContextPath() + "/LoginLector.jsp");
		} else if (null != libreria) {
			req.getSession().setAttribute("libreria", libreria);
			resp.sendRedirect(req.getContextPath() + "/LoginLibreria.jsp");
		} else {
			resp.sendRedirect(req.getContextPath() + "/Login.jsp");
		}
	}

}
