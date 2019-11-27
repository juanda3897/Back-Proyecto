package com.def.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.def.model.Bloque;
import com.def.model.Facultad;



@FeignClient(name = "universidad", url = "localhost:8080")
public interface DosServiceFeign {

	@PostMapping("/este")
	public Bloque agregar(@RequestBody Bloque b);
	
	@GetMapping("/estem")
	public List<Bloque>listar();
	
	@PostMapping("/facul")
	public Facultad agregar(@RequestBody Facultad f);
	
	@GetMapping("/faculm")
	public List<Facultad>listar1();
	
	
}
