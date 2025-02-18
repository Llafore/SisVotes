package com.Llafore.SisVotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Llafore.SisVotes.entity.CartorioEntity;
import com.Llafore.SisVotes.repository.CartorioRepository;

import payroll.CartorioNotFoundException;

@RestController
public class CartorioController {
	@Autowired
	private final CartorioRepository repository;
	
	CartorioController(CartorioRepository repository){
		this.repository = repository;
	}
	
	@GetMapping("/api/cartorios")
	public List<CartorioEntity> listAllCartorios(){
		return repository.findAll();
	}
	
	@PostMapping("/api/cartorios")
	public CartorioEntity newCartorio(@RequestBody CartorioEntity newCartorio) {
		return repository.save(newCartorio);
	}
	
	@GetMapping("/api/cartorio/{id}")
	public CartorioEntity getOneCartorio(@PathVariable int id) {
		return repository.findById(id)
				.orElseThrow(() -> new CartorioNotFoundException(id));
	}
	
	@PutMapping("/api/cartorios/{id}")
	public CartorioEntity replaceCartorio(@RequestBody CartorioEntity newCartorio, @PathVariable int id) {
		return repository.findById(id)
				.map(cartorio -> {
					cartorio.setNome(newCartorio.getNome());
					cartorio.setUf(newCartorio.getUf());
					return repository.save(cartorio);
				})
				.orElseGet(() -> {
					return repository.save(newCartorio);
				});
	}
	
	
//	@PutMapping("/api/cartorios/{id}")
//	public ResponseEntity<CartorioEntity> updateCartorioEntity(@PathVariable Long id,@RequestBody CartorioEntity receivedEntity) {
//		Optional<CartorioEntity> currentEntity = repository.findById(id);
//		if (currentEntity.isPresent()) {
//			CartorioEntity updateEntity = new CartorioEntity(receivedEntity.getId(),receivedEntity.getNome(), receivedEntity.getUf());
//			repository.save(updateEntity);
//			return ResponseEntity.ok(updateEntity);
//		} else {
//			receivedEntity.setId(id);
//            CartorioEntity newEntity = repository.save(receivedEntity);
//            URI uri = URI.create("/api/cartorios/" + newEntity.getId());
//            return ResponseEntity.created(uri).body(newEntity);
//		}
//	}
}