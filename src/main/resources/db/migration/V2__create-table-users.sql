CREATE TABLE users (
    user_id INT PRIMARY KEY,
    nome VARCHAR(100),
    sobrenome VARCHAR(100),
    username VARCHAR(50) UNIQUE,
    email VARCHAR(100) UNIQUE,
    senha VARCHAR(100),
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_ultima_atualizacao TIMESTAMP,
    status_conta VARCHAR(50),
    perfil_acesso VARCHAR(50)
);
