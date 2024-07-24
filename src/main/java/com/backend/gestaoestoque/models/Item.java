package com.backend.gestaoestoque.models;

import com.backend.gestaoestoque.dtos.response.ItemResponse;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "itens")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name = "nome")
	private String nome;
	
	@NotBlank
	@Column(name = "descricao")
	private String descricao;
	
	@NotNull
	@Column(name = "valor")
	private Double valor;
	
	@NotNull
	@Column(name = "quantidade")
	private Integer quantidade;
	
	@NotBlank
	@Column(name = "unidade_de_medida")
	private String unidadeDeMedida;
	
	@Column(name = "estoque_minimo")
	private Integer estoqueMinimo;
	
	@Column(name = "estoque_maximo")
	private Integer estoqueMaximo;
	
	@NotNull
	@Column(name = "necessidade_de_reposicao")
	private Boolean necessidadeDeReposicao;


}
