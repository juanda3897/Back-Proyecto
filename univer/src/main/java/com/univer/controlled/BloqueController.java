package com.univer.controlled;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.univer.entidad.Bloque;
import com.univer.entidad.Facultad;
import com.univer.service.BloqueService;
import com.univer.service.FacultadService;


@RestController
public class BloqueController {
	
	@Autowired
	BloqueService service;
	@Autowired
	FacultadService servicef;
	
	@PostMapping("/este")
	public Bloque agregar(@RequestBody Bloque b) {
		return service.add(b);
	}
	@PostMapping("/facul")
	public Facultad agregar(@RequestBody Facultad f) {
		return servicef.add(f);
	}
	
	@GetMapping("/estem")
	public List<Bloque> getList(){
		return service.getAllList();
	}
	@GetMapping("/faculm")
	public List<Facultad> getList1(){
		return servicef.listar();
	}

}
