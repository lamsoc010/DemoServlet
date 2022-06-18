package com.lamsoc010;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter w = resp.getWriter();
		
		w.println("<h1>Hoc Servlet vui qua</h1>");
		w.println("<h6>Hoc Servlet vui qua</h6>");
		w.close();
	}
}
