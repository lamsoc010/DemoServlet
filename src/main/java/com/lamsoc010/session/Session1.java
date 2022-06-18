package com.lamsoc010.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/hello-session"})
public class Session1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter w = resp.getWriter();
		
		HttpSession httpSession =  req.getSession();
		httpSession.setAttribute("name", "tranvinhlam");
		httpSession.setAttribute("age", 23);
		
		w.println("Xin chao day laf set session");
	}
}
