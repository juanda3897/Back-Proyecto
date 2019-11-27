package com.univer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univer.entidad.Bloque;
import com.univer.repository.BloqueRepository;
import com.univer.service.BloqueService;

@Service
public class BloqueServiceImp implements BloqueService{

	
	@Autowired
	private BloqueRepository repositorio;

	@Override
	public Bloque add(Bloque b) {
		
		return repositorio.save(b);
	}

	@Override
	public List<Bloque> getAllList() {
		
		return repositorio.findAll();
	}

	
	
}
