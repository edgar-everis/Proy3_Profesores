package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Profesores;
import com.main.repository.ProfesoresRepository;
import com.main.service.ProfesoresService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProfesoresServiceImpl implements ProfesoresService {
	
	@Autowired
	private ProfesoresRepository repo;

	@Override
	public Mono<Profesores> createProfesor(Profesores profesor) {
		// TODO Auto-generated method stub
		return repo.save(profesor);
	}

	@Override
	public Mono<Profesores> modifyProfesor(String id, Profesores profesor) {
		profesor.setId(id);
		// TODO Auto-generated method stub
		return repo.save(profesor);
	}

	@Override
	public Mono<Void> deleteById(String id) {
		// TODO Auto-generated method stub
		return repo.deleteById(id);
	}

	@Override
	public Mono<Profesores> findbyId(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public Flux<Profesores> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	

}
