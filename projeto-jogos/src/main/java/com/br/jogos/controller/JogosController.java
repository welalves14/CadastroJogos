package com.br.jogos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.jogos.model.Jogos;
import com.br.jogos.service.JogosService;

@Controller
public class JogosController {
	
	@Autowired
	private JogosService jogosService;
	
	@GetMapping("/jogos/formulario")
	public String cadastrar(){
		return "formulario";
	}
	@GetMapping("/jogos/salvar")
	public String salvar(Jogos jogos) {
		jogosService.cadastrarJogos(jogos);
		
		return "sucesso";
	}
	
	@GetMapping("/jogos/listar")
	public ModelAndView listarJogos() {
		List <Jogos> jogos = jogosService.listarJogos();
		ModelAndView mv = new ModelAndView("listagem-jogos");
		
		mv.addObject("listaJogos", jogos);
		
		
		return mv;
	}
	
	

}
