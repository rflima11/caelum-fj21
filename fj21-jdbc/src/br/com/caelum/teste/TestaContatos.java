package br.com.caelum.teste;

import java.sql.Date;
import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.modelo.Contato;

public class TestaContatos {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Eunice");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setEndereco("Águas Claras");
		contato.setEmail("eunice@gmail.com");
		
		ContatoDao dao = new ContatoDao();
		
		dao.adiciona(contato);
		
		
	}
}
