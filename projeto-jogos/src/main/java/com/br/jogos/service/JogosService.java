package com.br.jogos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.jogos.model.Jogos;
import com.br.jogos.repository.JogosRepository;

@Service
public class JogosService {
	
	@Autowired
	private JogosRepository jogosRepo;
	
	 public void cadastrarJogos(Jogos jogos) {
		 jogosRepo.save(jogos);
	 }
	 public List<Jogos> listarJogos() {
		 
		 return jogosRepo.findAll();
		 
	 }

}
