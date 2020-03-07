package br.com.caelum;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hora extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Minha Primeira Servlet</title>");
		out.println("<head>");
		out.println("<body>");
		out.println("<h1>Oi mundo!<h1>");
		out.println("<body>");
		out.println("<html>");
		
	}
	
	
	

}
