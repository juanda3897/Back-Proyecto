package com.user.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.user.entidad.Usuario;

public interface UsuarioRepository extends Repository<Usuario, Integer>{
	
	List<Usuario>findAll();
	Usuario save(Usuario u);

}
