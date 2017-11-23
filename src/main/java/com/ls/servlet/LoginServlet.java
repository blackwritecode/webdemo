package com.ls.servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends BaseServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5439395858971706056L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		// log.info("user:" + user.toString());
		log.info(request.toString());
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
			log.debug("数据编码不正确！");
		}
		String querystr = request.getQueryString();
		log.info("url传参" + querystr);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("用户名：" + username + "--密码：" + password);
		if ("123".equals(username) && "123".equals(password)) {
			log.info("验证成功!");
			try {
				response.sendRedirect("a.jsp");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			log.info("用户名或密码错误！");
			try {
				response.sendRedirect("error.jsp");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		doGet(request, response);
	}

}
