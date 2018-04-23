package com.bookadvisor.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookadvisor.dao.LectorDAOImplementation;
import com.bookadvisor.dao.LibreriaDAOImplementation;
import com.bookadvisor.dao.model.Lector;
import com.bookadvisor.dao.model.Libreria;

@WebServlet ("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ck=req.getCookies();
        ck1=ck[0];
        //Eliminar
       
        
		

		if (ck1 != null ) {
            //Eliminar
            ck1.setMaxAge(0);
            resp.setCookie(ck1);
			resp.sendRedirect(req.getContextPath() + "/index.html");
            System.out.println("Cookie borrada");
		} else {
			resp.sendRedirect(req.getContextPath() + "/index.html");
		}
	}

}
