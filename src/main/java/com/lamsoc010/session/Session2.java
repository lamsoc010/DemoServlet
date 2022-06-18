package com.lamsoc010.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/getSession"})
public class Session2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter w = resp.getWriter();
		
		HttpSession httpSession = req.getSession();
		String name = String.valueOf(httpSession.getAttribute("name"));
		int age = (Integer)httpSession.getAttribute("age");
		w.println("Ten: " + name);
		w.println("Tuoi: " + age);
	}
}
