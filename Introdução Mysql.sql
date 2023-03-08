
-- Comando para criação de banco de Dados
CREATE DATABASE db_quitanda;

-- Comando que indica ao msql workbench o banco de dados que estamos usando
USE db_quitanda;

CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT,
    nome_produto VARCHAR(255),
    preco DECIMAL(6,2),
    
    
    PRIMARY KEY(id)

);

SELECT * FROM tb_produtos;

INSERT INTO tb_produtos(nome_produto, preco) VALUES ("Banana", 5.00),("Mexirica", 7.00);


-- DESATIVA O MODO SEGURO DO MYSQL E PERMITE UPDATE E DELETE
SET SQL_SAFE_UPDATES = 0;

-- atualizar dado dentro da minha tabela
UPDATE tb_produtos SET preco = 7.90 WHERE id=6;