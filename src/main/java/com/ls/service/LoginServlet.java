package com.ls.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends BaseServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5439395858971706056L;
	
	
	public void doGet(HttpServletRequest request ,HttpServletResponse response){
		log.info(request.toString());
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		String querystr = request.getQueryString();
		log.info("url传参" + querystr);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("用户名：" + username + "--密码：" + password);
		
		try {
			response.sendRedirect("a.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest request ,HttpServletResponse response){
		doGet(request,response);
	}

}
