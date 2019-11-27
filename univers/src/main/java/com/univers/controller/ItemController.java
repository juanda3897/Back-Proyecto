package com.univers.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univers.model.Item;
import com.univers.service.ItemService;


@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
public class ItemController {

	
	@Autowired(required = true)
	@Qualifier("itemServiceFeign")
	private ItemService service;
	
	@GetMapping("/estem")
	public List<Item> getAll(){
		return service.getAll();
	}
}
