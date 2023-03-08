CREATE DATABASE db_aluno;

USE db_aluno;

CREATE TABLE tb_dados(
	id BIGINT AUTO_INCREMENT, nome_completo VARCHAR(255), 
    telefone VARCHAR(255), 
    matricula BIGINT,
    disciplina VARCHAR(255),
    nota DECIMAL(6,2),
    
    PRIMARY KEY(id)
    );
    

    
    SELECT * FROM tb_dados;
    
    INSERT INTO tb_dados(nome_completo, telefone, matricula, disciplina, nota)VALUES
    ("João Panzo", "(11) 923567678", 23456, "Matemática", 8), 
    ("Carlos Pedro", "(11) 956569074", 10456, "Matemática", 5), 
    ("André de Matos", "(11) 955069472", 70256, "Matemática", 10),
    ("Rony Gabriel", "(11) 956069071", 7987, "Matemática", 7),
    ("Giovana Gabriel", "(11) 955069472", 70256, "Matemática", 3),
    ("Faustino Mbenza", "(85) 9975069456", 34256, "Matemática", 9),
    ("Garcia de Deus", "(71) 955069472", 89254, "Matemática", 8),
    ("Daniel Matuidi", "(21) 912056400", 65458, "Matemática", 2),
    ("Jonas Maravilha", "(11) 993069567", 12432, "Matemática", 7);
    
  SELECT * FROM tb_dados WHERE nota > 7;
  
  SELECT * FROM tb_dados WHERE nota < 7;
  
  SET SQL_SAFE_UPDATES = 0;
  
  UPDATE tb_dados SET nota = 6 WHERE id = 8;
  
  
  
