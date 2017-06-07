package com.ls.servlet;

import javax.servlet.http.HttpServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3032680868152444237L;
	
	/*
	 * 日志对象
	 */
	protected Logger log = LoggerFactory.getLogger(this.getClass());

}
