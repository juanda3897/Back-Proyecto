package com.user.service;

import java.util.List;

import com.user.entidad.Usuario;

public interface UsuarioService {

	List<Usuario>listar();
	Usuario add(Usuario u);
	
}
