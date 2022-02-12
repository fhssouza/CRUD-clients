package com.dsclient.client.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsclient.client.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> client = new ArrayList<>();
		client.add(new Client(1L, "Fábio Souza", "999.999.999-99", 3000D, null, 42));
		client.add(new Client(1L, "Fábio Souza", "999.999.999-99", 3000D, null, 42));
		client.add(new Client(1L, "Fábio Souza", "999.999.999-99", 3000D, null, 42));
		
		
		return ResponseEntity.ok().body(client);
	}
}
