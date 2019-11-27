package com.def.feign;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.def.model.Usuario;

@FeignClient(value = "Usuario", url = "localhost:9090")
public interface UsuarioServiceFeign {

	@PostMapping
	public Usuario agregar(@RequestBody Usuario u);
	
	@GetMapping("/list")
	public List<Usuario> getList();
	
}
