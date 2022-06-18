package com.lamsoc010.loginSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/welcome-session"})
public class Welcome extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter w = resp.getWriter();
		
		HttpSession httpSession = req.getSession();
		String username = String.valueOf(httpSession.getAttribute("username"));
		if(username == "null") {
			resp.sendRedirect("/DemoServlet/login-session");
		}
		w.println("Xin chao" + username);
	}
}
