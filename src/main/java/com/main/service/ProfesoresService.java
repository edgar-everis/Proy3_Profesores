package com.main.service;


import com.main.model.Profesores;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProfesoresService {

	Mono<Profesores> createProfesor(Profesores profesor);

	Mono<Profesores> modifyProfesor(String id, Profesores profesor);

	Mono<Void> deleteById(String id);

	Mono<Profesores> findbyId(String id);

	Flux<Profesores> getAll();
}
