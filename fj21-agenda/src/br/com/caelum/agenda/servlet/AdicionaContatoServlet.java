package br.com.caelum.agenda.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

@WebServlet("/adicionaContato")
public class AdicionaContatoServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
	PrintWriter	pw = response.getWriter();
	
	String nome = request.getParameter("nome");
	String email = request.getParameter("email");
	String endereco = request.getParameter("endereco");
	String dataEmTexto = request.getParameter("dataNascimento");
	Calendar dataNascimento = null;
	
	try {
		Date date = 
				new SimpleDateFormat("dd/MM/yyyy")
				.parse(dataEmTexto);
		dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(date);
	} catch (ParseException e) {
		System.out.println("Erro de conversão de data");
		return;
	}
	
	Contato contato = new Contato();
	contato.setNome(nome);
	contato.setEmail(email);
	contato.setEndereco(endereco);
	contato.setDataNascimento(dataNascimento);
	
	ContatoDao dao = new ContatoDao();
	
	dao.adiciona(contato);
	
	pw.println("<html>");
	pw.println("<body>");
	pw.println("Contato " + contato.getNome() + " adicionado com sucesso!");
	pw.println("<body>");
	pw.println("<html>");
		
	
	}

}
