package com.backend.gestaoestoque.models;

import com.backend.gestaoestoque.dtos.response.ItemResponse;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "valor")
	private Double valor;
	
	@Column(name = "quantidade")
	private Integer quantidade;
	
	@Column(name = "unidade_de_medida")
	private String unidadeDeMedida;
	
	@Column(name = "estoque_minimo")
	private Integer estoqueMinimo;
	
	@Column(name = "estoque_maximo")
	private Integer estoqueMaximo;
	
	@Column(name = "necessidade_de_reposicao")
	private Boolean necessidadeDeReposicao;
	
	public Item(ItemResponse itemResponse) {
		this.nome = itemResponse.nome();
		this.descricao = itemResponse.descricao();
		this.valor = itemResponse.valor();
		this.quantidade = itemResponse.quantidade();
		this.unidadeDeMedida = itemResponse.unidadeDeMedida();
		this.estoqueMinimo = itemResponse.estoqueMinimo();
		this.estoqueMaximo = itemResponse.estoqueMaximo();
		this.necessidadeDeReposicao = itemResponse.necessidadeDeReposicao();
		
	}

}
