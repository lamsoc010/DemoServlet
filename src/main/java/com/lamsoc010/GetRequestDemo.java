package com.lamsoc010;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/get-request"})
public class GetRequestDemo extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter w = resp.getWriter();
		
		String ten = req.getParameter("ten");
		String tuoi = req.getParameter("tuoi");
		
		w.println("xin chao " + ten + ", tuoi: " + tuoi);
	}
}
