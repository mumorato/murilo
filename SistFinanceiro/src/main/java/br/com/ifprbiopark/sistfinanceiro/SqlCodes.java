package br.com.ifprbiopark.sistfinanceiro;

public class SqlCodes {
    /*
    // sql codes para criar tabelas
    CREATE TABLE IF NOT EXISTS ESTADO (
        idEstado INT PRIMARY KEY AUTO_INCREMENT,
        nomeEstado VARCHAR(50),
        siglaEstado VARCHAR(2)
    );

    CREATE TABLE IF NOT EXISTS CIDADE (
        idCidade INT PRIMARY KEY AUTO_INCREMENT,
        nomeCidade VARCHAR(50),
        estadoId INT
        CONSTRAINT (cidadeEstadofk)
            FOREIGN KEY (estadoId)
            REFERENCES ESTADO(id)
    );
    
    CREATE TABLE IF NOT EXISTS PESSOA (
        idPessoa INT PRIMARY KEY AUTO_INCREMENT,
        nomePessoa VARCHAR(80) NOT NULL,
        tipoPessoa VARCHAR(1),
        cpfCnpj VARCHAR(14),
        telefone VARCHAR(20),
        endereco VARCHAR(80),
        bairro VARCHAR(50),
        cidadeId INT,
        cliente TINYINT,
        fornecedor TINYINT,
        registroAtivo TINYINT,
        CONSTRAINT (pessoaCidadefk)
            FOREIGN KEY (cidadeId)
            REFERENCES CIDADE(id)
    );

    CREATE TABLE IF NOT EXISTS TIPOTITULO (
        idTipoTitulo INT PRIMARY KEY AUTO_INCREMENT,
        nomeTipoTitulo VARCHAR(50)
    );

    CREATE TABLE IF NOT EXISTS CATEGORIA (
        idCategoria INT PRIMARY KEY AUTO_INCREMENT,
        nomeCategoria VARCHAR(50)
    );
    CREATE TABLE IF NOT EXISTS SUBCATEGORIA (
        idSubcategoria INT PRIMARY KEY AUTO_INCREMENT,
        categoriaId INT,
        nomeSubcategoria VARCHAR(50),
        CONSTRAINT (categoriaSubcategoriafk)
            FOREIGN KEY (categoriaId)
            REFERENCES CATEGORIA(id)
    );
    CREATE TABLE IF NOT EXISTS TITULO (
        idTitulo INT PRIMARY KEY AUTO_INCREMENT,
        numeroTitulo INT,
        numeroParcela INT,
        tipoTituloId INT,
        pessoaId INT,
        categoriaId INT,
        dataCadastro TIMESTAMP,
        dataVencimento DATE,
        valorTitulo DECIMAL(9,2),
        pendente TINYINT,
        registroAtivo TINYINT,    
        CONSTRAINT (tituloTipoTitulofk)
            FOREIGN KEY (tipotituloId)
            REFERENCES TIPOTITULO(id),
        CONSTRAINT (tituloCategoriafk)
            FOREIGN KEY (categoriaId)
            REFERENCES CATEGORIA(id),
        CONSTRAINT (tituloPessoafk)
            FOREIGN KEY (pessoaId)
            REFERENCES PESSOA(id)
    );        



     */
}
