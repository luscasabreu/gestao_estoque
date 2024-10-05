package com.backend.gestaoestoque.models;

import java.security.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
	
	@Column(name = "user_id")
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@NotBlank
	@Column(name = "nome")
	private String nome;
	
	@NotBlank
	@Column(name = "sobrenome")
	private String sobrenome;
	
	@NotBlank
	@Email
	@Column(name = "email")
	private String email;
	
	@NotBlank
	@Column(name = "senha")
	private String senha;
	
	@CreationTimestamp
	@NotNull
	@Column(name = "data_criacao")
	private Timestamp dataCriacao;
	
	@UpdateTimestamp
	@NotNull
	@Column(name = "data_ultima_atualizacao")
	private Timestamp dataUltimaAtualizacao;
	
	@NotBlank
	@Column(name = "status_conta")
	private String statusConta;
	
	@NotBlank
	@Column(name = "perfil_acesso")
	private String perfilAcesso;
	
}
