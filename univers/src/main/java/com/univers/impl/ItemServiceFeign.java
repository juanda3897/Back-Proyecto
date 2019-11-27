package com.univers.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univers.feign.BloqueServiceFeign;
import com.univers.model.Bloque;
import com.univers.model.Item;
import com.univers.service.ItemService;

@Service("itemServiceFeign")
public class ItemServiceFeign implements ItemService{
	
	@Autowired
	private BloqueServiceFeign feign;

	@Override
	public List<Item> getAll() {
		List<Bloque> bloques = feign.getList();
		return bloques.stream().map(bloq -> new Item(1,bloq)).collect(Collectors.toList());
	}
	
	

}
