package com.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entidad.Usuario;
import com.user.repository.UsuarioRepository;
import com.user.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService{
	
	@Autowired
	private UsuarioRepository repositorio;
	
	
	@Override
	public Usuario add(Usuario u) {
		// TODO Auto-generated method stub
		return repositorio.save(u);
	}


	@Override
	public List<Usuario> listar() {
		
		return repositorio.findAll();
	}

}
