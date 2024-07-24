package com.backend.gestaoestoque.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.gestaoestoque.models.Item;
import com.backend.gestaoestoque.services.ItemService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/itens")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@PostMapping
	public ResponseEntity<Item> salvar(@RequestBody @Valid Item item) {
		Item itemSalvo = itemService.salvar(item);

		return ResponseEntity.status(HttpStatus.CREATED).body(itemSalvo);
	}

	@GetMapping
	public ResponseEntity<List<Item>> listarTodos() {
		List<Item> itens = itemService.buscarTodos();
		
		return ResponseEntity.status(HttpStatus.OK).body(itens);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Item>> listarPorId(@PathVariable Long id) {
		Optional<Item> item = itemService.buscarPorId(id);
		
		if(item.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(item);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Item> atualizar(@PathVariable Long id, @RequestBody @Valid Item item) {
		itemService.atualizar(id, item);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(item);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		itemService.deletar(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
}