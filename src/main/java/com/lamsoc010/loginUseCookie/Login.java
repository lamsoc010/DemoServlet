package com.lamsoc010.loginUseCookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login"})
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter w = resp.getWriter();
		
		w.println("<form action='/DemoServlet/login' method='post'>");
		w.println("Username: <input type='text' name='username'>");
		w.println("Password: <input type='password' name='password'>");
		w.println("<input type='submit' value='login'>");
		w.println("</form>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(username.equals("tranvinhlam") && password.equals("123123")) {
			Cookie cookie = new Cookie("username", username);
			cookie.setMaxAge(30);
			resp.addCookie(cookie);
			resp.sendRedirect("/DemoServlet/welcome");
		} else {
			resp.sendRedirect("/DemoServlet/login");
		}
	}
}
