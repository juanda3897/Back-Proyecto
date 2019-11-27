package com.univer.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.univer.entidad.Facultad;

public interface FacultadRepository extends Repository<Facultad, Integer>{
	List<Facultad>findAll();
	Facultad save(Facultad f);
}
