package com.Llafore.SisVotes.repository;

import org.springframework.stereotype.Repository;
import com.Llafore.SisVotes.entity.ColaboradorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ColaboradorRepository extends
	JpaRepository<ColaboradorEntity,Integer>{

}
