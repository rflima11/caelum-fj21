package br.com.caelum.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.modelo.Contato;

public class TestaUpdate {
	
	public static void main(String[] args) {
		
		ContatoDao dao = new ContatoDao();
		
		Contato contato = new Contato();
		
		contato.setId(1);
		contato.setNome("Rodolfo");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setEmail("rodolfo@gmail.com");
		contato.setEndereco("qnl 10");
		
		dao.atualiza(contato);
		System.out.println("Atualizado");
	}

}
