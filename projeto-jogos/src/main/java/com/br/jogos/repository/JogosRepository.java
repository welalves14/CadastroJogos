package com.br.jogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.jogos.model.Jogos;

@Repository
public interface JogosRepository extends JpaRepository<Jogos, Long>{
	

}
