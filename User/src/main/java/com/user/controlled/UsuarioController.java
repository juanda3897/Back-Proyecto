package com.user.controlled;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entidad.Usuario;
import com.user.service.UsuarioService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/registro"})
public class UsuarioController {
	
	@Autowired
	UsuarioService service;
	
	@PostMapping
	public Usuario agregar(@RequestBody Usuario u) {
		return service.add(u);
	}
	@GetMapping("/list")
	public List<Usuario>listar(){
		return service.listar();
	}
}
