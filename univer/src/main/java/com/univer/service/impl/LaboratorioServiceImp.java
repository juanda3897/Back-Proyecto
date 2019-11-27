package com.univer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.univer.entidad.Laboratorio;
import com.univer.repository.LaboratorioRepository;
import com.univer.service.LaboratorioService;

public class LaboratorioServiceImp implements LaboratorioService{
	
	
	
	@Autowired
	private LaboratorioRepository repositorio;
	
	@Override
	public Laboratorio add(Laboratorio l) {
	
		return repositorio.save(l);
	}

}
