package com.main.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@Document(collection = "Profesores")
public class Profesores {

	@Id
	private String id;
	
	private String nombre;
	
	private String typodoc;
	
	private String documento;
}
