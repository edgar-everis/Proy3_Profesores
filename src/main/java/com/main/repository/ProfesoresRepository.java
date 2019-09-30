package com.main.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Profesores;

@Repository
public interface ProfesoresRepository extends ReactiveMongoRepository<Profesores, String> {

	
}
