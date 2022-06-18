package com.lamsoc010;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/test-config"}, initParams = {
		@WebInitParam(name = "name", value = "tran vinh lam dep trai"),
		@WebInitParam(name = "age", value = "18")
})
public class ServletConfigDemo extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = super.getServletConfig().getInitParameter("name");
		int age = Integer.valueOf(super.getServletConfig().getInitParameter("age"));
		String driver = super.getServletConfig().getInitParameter("driver");
		resp.setContentType("text/html");
		PrintWriter w = resp.getWriter();
		w.println("xin chao" + name + "tuoi: " +age);
		w.println(driver);
	}
}
