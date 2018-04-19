package com.bookadvisor.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookadvisor.dao.LectorDAOImplementation;
import com.bookadvisor.dao.model.Lector;

@WebServlet("/CreateLectorServlet")
public class CreateLectorServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		Lector lector = new Lector()
								.setEmail(email)
								.setNombre(name)
								.setPassword(password);
		
		LectorDAOImplementation.getInstance().create(lector);
	    resp.sendRedirect(req.getContextPath() + "/Login.jsp");
	}
}