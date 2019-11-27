package com.univer.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.univer.entidad.Bloque;

public interface BloqueRepository extends Repository<Bloque, Integer>{
	
	List<Bloque>findAll();
	Bloque save(Bloque b);
}
