package br.com.caelum.agenda.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

@WebServlet("/testaLista")
public class ListaContatoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter pw = response.getWriter();
		ContatoDao dao = new ContatoDao();
		List<Contato> lista = dao.getLista();
		
		
			pw.println("<html>");
			pw.println("<body>");
			pw.println("<ol>");
			for(int i = 0; i < lista.size(); i++ ) {
			pw.println("<li> Nome: " + lista.get(i).getNome() + "</li>");
			}
			pw.println("<ol>");
			pw.println("<body>");
			pw.println("<html>");
		
	}

}
