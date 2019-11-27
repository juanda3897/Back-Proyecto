package com.univer.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.univer.entidad.Laboratorio;

public interface LaboratorioRepository extends Repository<Laboratorio, Integer>{
		
	List<Laboratorio>findAll();
	Laboratorio save(Laboratorio l);
}
