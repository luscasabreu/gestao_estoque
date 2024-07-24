package com.backend.gestaoestoque.dtos.response;

public record ItemResponse( 
		Long id,
		String nome, 
		String descricao, 
		Double valor, 
		Integer quantidade, 
		String unidadeDeMedida,
		Integer estoqueMinimo, 
		Integer estoqueMaximo, 
		Boolean necessidadeDeReposicao
		) {

}
