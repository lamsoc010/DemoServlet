package com.lamsoc010;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/setCookie"})
public class DemoCookie extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter w = resp.getWriter();
		
		w.println("Xin chao tran vinh lam");
		
		Cookie cookie = new Cookie("name", "TranVinhLam");
		cookie.setMaxAge(5);
		resp.addCookie(cookie);
		
		Cookie cookie2 = new Cookie("age", "23");
		cookie2.setMaxAge(10);
		resp.addCookie(cookie2);
	}
}
