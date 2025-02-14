package com.Llafore.SisVotes.repository;

import org.springframework.stereotype.Repository;
import com.Llafore.SisVotes.entity.VotoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface VotoRepository extends
	JpaRepository<VotoEntity,Integer>{

}
