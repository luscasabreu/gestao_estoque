package com.backend.gestaoestoque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.gestaoestoque.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
}

