package com.bookadvisor.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookadvisor.dao.LibreriaDAOImplementation;
import com.bookadvisor.dao.model.Libreria;

@WebServlet("/CreateLectorServlet")
public class CreatePublicistaServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String url = req.getParameter("url");
		
		Libreria publicista = new Libreria()
									.setNombre(name)
									.setEmail(email)
									.setPassword(password)
									.setWeb(url);
		
		LibreriaDAOImplementation.getInstance().create(publicista);
	    resp.sendRedirect(req.getContextPath() + "/iniciarsesion.jsp");
	}
}
