package com.ls.service;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3032680868152444237L;
	/*
	 * static 静态属性，共享，需要动态继承的属性不建议使用。
	 * 
	 */
	protected Logger log = LoggerFactory.getLogger(this.getClass());

	protected HttpServletRequest request;
	
	protected HttpServletResponse response;
}
