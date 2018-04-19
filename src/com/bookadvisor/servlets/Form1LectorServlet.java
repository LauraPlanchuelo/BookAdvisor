package com.bookadvisor.servlet;

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

@WebServlet("/Form1LectorServlet")
public class Form1LectorServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("nombre");
		String email = req.getParameter("email");
		String password = req.getParameter("password");


		LECTOR lector = new LECTOR();
	    tfg.setEmail(email);
	    tfg.setName(nombre);
	    tfg.setPassword(password);
	    tfg.setStatus(1);

	    LectorDAOImplementation.getInstance().createLector(lector);

	    resp.sendRedirect(req.getContextPath() + "/Login.jsp");
	}
}
