package com.Llafore.SisVotes.repository;

import org.springframework.stereotype.Repository;
import com.Llafore.SisVotes.entity.CartorioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CartorioRepository extends
	JpaRepository<CartorioEntity,Integer>{

}
