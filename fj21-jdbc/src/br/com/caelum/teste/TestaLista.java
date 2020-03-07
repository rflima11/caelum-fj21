package br.com.caelum.teste;

import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.modelo.Contato;

public class TestaLista {

	public static void main(String[] args) {
		
		ContatoDao dao = new ContatoDao();
		
		List<Contato> contatos = dao.listarContatos();
		
		for (Contato contato : contatos) {
			System.out.println("O nome do contato é: " + contato.getNome());
			System.out.println("O email do contato é: " + contato.getEmail());
			System.out.println("O endereço do contato é: " + contato.getEndereco());
			System.out.println("A data de nascimento do contato é: " + contato.getDataNascimento());
			
		}
	}
}
