package com.univer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univer.entidad.Facultad;
import com.univer.repository.FacultadRepository;
import com.univer.service.FacultadService;

@Service
public class FacultadServiceImp implements FacultadService{

	@Autowired
	 private FacultadRepository repositorio;

	@Override
	public Facultad add(Facultad f) {
		// TODO Auto-generated method stub
		return repositorio.save(f);
	}

	@Override
	public List<Facultad> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	} 
}
