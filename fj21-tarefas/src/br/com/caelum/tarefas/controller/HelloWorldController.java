package br.com.caelum.tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/olaMundoSpring")
	public String executa() {
		System.out.println("Executando o executa");
		return "ok";
	}
}
