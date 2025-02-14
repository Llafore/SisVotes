package com.Llafore.SisVotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Llafore.SisVotes.entity.CartorioEntity;
import com.Llafore.SisVotes.repository.CartorioRepository;

@RestController
public class CartorioController {
	@Autowired
	CartorioRepository repository;
	
	@GetMapping("/api/cartorios")
	public ResponseEntity<List<CartorioEntity> > listCartorios(){
		List<CartorioEntity> retorno = repository.findAll();
		if(retorno.isEmpty()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.ok(retorno);
		}
	}
	
}
