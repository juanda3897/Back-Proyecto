package com.univers.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.univers.model.Bloque;
import com.univers.model.Item;
import com.univers.service.ItemService;

@Service("itemServiceRestTemplate")
public class ItemServiceRestTemplate implements ItemService{

	
	@Autowired
	private RestTemplate clientRest;
	
	@Override
	public List<Item> getAll() {
		List<Bloque> bloques = Arrays.asList(clientRest.getForObject("http://localhost:7474/estem", Bloque[].class));
				return bloques.stream().map(bloq -> new Item(1,bloq)).collect(Collectors.toList());
	}

}
