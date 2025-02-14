package com.Llafore.SisVotes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Llafore.SisVotes.entity.CartorioEntity;
import com.Llafore.SisVotes.repository.CartorioRepository;

@RestController
public class CartorioController {
	@Autowired
	private final CartorioRepository repository;
	
	CartorioController(CartorioRepository repository){
		this.repository = repository;
	}
	
	@GetMapping("/api/cartorios")
	public List<CartorioEntity> listCartorios(){
		return repository.findAll();
	}
	
	@PutMapping("/api/cartorios")
	public CartorioEntity updateCartorioEntity(@RequestBody CartorioEntity newEntity) {
		return repository.findById(newEntity.getId())
				.map(cartorio -> {
					cartorio.setNome(newEntity.getNome());
					cartorio.setUf(newEntity.getUf());
					return repository.save(cartorio);
				})
				.orElseGet(() -> {
					return repository.save(newEntity);
				});
	}
}

// GPTOLAS: 
//@PutMapping("/api/cartorios")
//public CartorioEntity updateCartorioEntity(@RequestBody CartorioEntity newEntity) {
//    return Optional.ofNullable(repository.findById(newEntity.getId()))
//            .map(cartorio -> {
//                cartorio.setNome(newEntity.getNome());
//                cartorio.setUf(newEntity.getUf());
//                return repository.save(cartorio);
//            })
//            .orElseGet(() -> repository.save(newEntity));
//}

