package com.backend.gestaoestoque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.gestaoestoque.models.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
