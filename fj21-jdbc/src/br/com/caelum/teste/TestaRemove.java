package br.com.caelum.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.modelo.Contato;

public class TestaRemove {
	
	public static void main(String[] args) {
		
		
		ContatoDao dao = new ContatoDao();
		
		Contato contato = new Contato();
		contato.setId(1);
		
		dao.remove(contato);
		System.out.println("Removido");
	}

}
