package com.ls.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JsonServlet extends BaseServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json;charset=utf-8");

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		log.info("username:" + username);
		log.info("password" + password);
		String jsonStr = "{\"name\":\"" + username + "\"}";
		
		PrintWriter out = null;
		out = resp.getWriter();
		out.write(jsonStr);

		if (out != null) {
			out.close();
		}
	}

}
