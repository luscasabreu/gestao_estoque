create table itens (
    id bigint not null auto_increment,
    nome varchar(100) not null,
    descricao varchar(255) not null,
    valor decimal(10, 2) not null,
    quantidade int not null,
    unidade_de_medida varchar(15) not null,
    estoque_minimo int not null,
    estoque_maximo int,
    necessidade_de_reposicao boolean not null,
    
    
    primary key(id)
);

