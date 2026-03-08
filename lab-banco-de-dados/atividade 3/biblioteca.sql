CREATE DATABASE Biblioteca;

USE Biblioteca;

CREATE TABLE categoriaLeitor (
    id_categoria INT PRIMARY KEY AUTO_INCREMENT,
    descricao_categoria VARCHAR(100) NOT NULL,
    dias_emprestimo INT DEFAULT(7)
);

CREATE TABLE categoriaObra (
    id_categoria INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL
);

CREATE TABLE leitor (
    id_leitor INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(200) NOT NULL,
    endereco VARCHAR(300) NOT NULL,
    cidade VARCHAR(100) NOT NULL,
    estado CHAR(2) NOT NULL,
    telefone VARCHAR(30),
    email VARCHAR(100) UNIQUE,
    documento VARCHAR(50) NOT NULL,
    categoria_leitor_id INT NOT NULL,
    data_nascimento DATE,
    
    FOREIGN KEY (categoria_leitor_id) REFERENCES categoria_leitor(id_categoria)
);

CREATE TABLE obra (
	id_obra int PRIMARY KEY AUTO_INCREMENT,
	isbn VARCHAR(20) unique,
	titulo VARCHAR(50) NOT NULL,
	autores VARCHAR(100) NOT NULL,
	palavras_chave VARCHAR(100),
	data_publicacao DATE,
	numero_edicao INT,
	editora VARCHAR(100),
	numero_pagina INT,
  	categoria_obra_id INT NOT NULL,
	
  	FOREIGN KEY (categoria_obra_id) REFERENCES categoriaObra(id_categoria)
);

CREATE TABLE copia(
	id_copia INT PRIMARY KEY AUTO_INCREMENT,
  	status varchar(50),
  	id_obra int NOT NULL,

 	FOREIGN KEY (id_obra) REFERENCES obra(id_obra)
);

CREATE TABLE funcionario(
	id_funcionario INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(100) NOT NULL,
  	telefone VARCHAR(30) NOT NULL,
  	email VARCHAR(100) NOT NULL,
  	senha VARCHAR(100),
  	endereco VARCHAR(100),
  	cidade VARCHAR(100),
  	estado VARCHAR(2),
  	data_nascimento DATE
);

CREATE TABLE reserva(
  	id_reserva INT PRIMARY KEY AUTO_INCREMENT,
  	data_reserva DATE,
  	data_prevista_retirada DATE,
  	data_prevista_devolucao DATE,
  	leitor INT NOT NULL,
  	obra INT NOT NULL,

  	FOREIGN KEY (obra) REFERENCES obra(id_obra),
  	FOREIGN KEY (leitor) REFERENCES leitor(id_leitor)
);

CREATE TABLE emprestimo(
  	id_emprestimo INT PRIMARY KEY AUTO_INCREMENT,
  	data_emprestimo DATE,
  	data_prevista_devolucao DATE,
  	data_devolucao DATE,
  	multa DECIMAL(15,2) default 0,
  	situacao VARCHAR(100),
  	leitor INT NOT NULL,
  	copia INT NOT NULL,
  	funcionario INT NOT NULL,

  	FOREIGN KEY (leitor) REFERENCES leitor(id_leitor),
  	FOREIGN KEY (copia) REFERENCES copia(id_copia),
  	FOREIGN KEY (funcionario) REFERENCES funcionario(id_funcionario)
);  
