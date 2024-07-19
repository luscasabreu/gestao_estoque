package com.backend.gestaoestoque.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.gestaoestoque.models.Item;
import com.backend.gestaoestoque.repositories.ItemRepository;



@Service
@Transactional
public class ItemService {
	
	@Autowired
	private ItemRepository repository;
	
	public Item salvar(Item item) {
		return repository.save(item);
	}
	
	public List<Item> buscarTodos() {
		return repository.findAll();
	}
	
	public Optional<Item> buscarPorId(Long id) {
		return repository.findById(id);
	}
	
	public void deletar(Long id) {
		repository.deleteById(id);;
	}
	
}
