CREATE DATABASE Oficina;
GO

USE Oficina;
GO

CREATE TABLE Oficina (
    codigo INT PRIMARY KEY,
    cnpj VARCHAR(20) NOT NULL,
    nome VARCHAR(100) NOT NULL,
    responsavel VARCHAR(100) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL
);
GO

CREATE TABLE Fabricante (
    codigo INT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(15) NOT NULL,
    email VARCHAR(50) NOT NULL,
    responsavel VARCHAR(100) NOT NULL
);
GO

CREATE TABLE Modelo (
    codigo_modelo INT PRIMARY KEY,
    tipo VARCHAR(50) NOT NULL,
    peso INT DEFAULT 0,
    horaTeste INT,
    codigo_fabricante INT,
    codigo_oficina INT,

    FOREIGN KEY (codigo_fabricante) REFERENCES Fabricante(codigo),
    FOREIGN KEY (codigo_oficina) REFERENCES Oficina(codigo)
);
GO

CREATE TABLE Maquina (
    numero_registro INT PRIMARY KEY,
    ano_fabricacao INT NOT NULL,
    horas_uso INT DEFAULT 0,
    modelo INT,
    
    FOREIGN KEY (modelo) REFERENCES Modelo(codigo_modelo)
);
GO

CREATE TABLE Tecnico (
    codigo_funcional INT PRIMARY KEY,
    endereco VARCHAR(150) NOT NULL,
    telefone VARCHAR(15) NOT NULL,
    salario DECIMAL(10,2) NOT NULL,
    qualificacao VARCHAR(100) NOT NULL,
    codigo_oficina INT,
    
    FOREIGN KEY (codigo_oficina) REFERENCES Oficina(codigo)
);
GO

CREATE TABLE Teste (
    codigo INT PRIMARY KEY,
    pontuacao INT NOT NULL,
    resultado VARCHAR(50) NOT NULL,
    recomendacoes VARCHAR(250),
    codigo_oficina INT,
    codigo_tecnico INT,
    
    FOREIGN KEY (codigo_oficina) REFERENCES Oficina(codigo),
    FOREIGN KEY (codigo_tecnico) REFERENCES Tecnico(codigo_funcional)
);
GO

CREATE TABLE Tecnico_Modelo (
    codigo_tecnico INT,
    codigo_modelo INT,
    
    PRIMARY KEY (codigo_tecnico, codigo_modelo),
    
    FOREIGN KEY (codigo_tecnico) REFERENCES Tecnico(codigo_funcional),
    FOREIGN KEY (codigo_modelo) REFERENCES Modelo(codigo_modelo)
);
