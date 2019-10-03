package br.com.ifprbiopark.sistfinanceiro;
public class SqlCodes {
 /*
    // sql codes para criar tabelas
    CREATE TABLE IF NOT EXISTS ESTADO (
        id INT PRIMARY KEY AUTO_INCREMENT,
        nome VARCHAR(50),
        sigla VARCHAR(2)
    );

    CREATE TABLE IF NOT EXISTS CIDADE (
        id INT PRIMARY KEY AUTO_INCREMENT,
        nome VARCHAR(50),
        estadoId INT
        CONSTRAINT (cidadeEstadofk)
            FOREIGN KEY (estadoId)
            REFERENCES ESTADO(id)
    );
    
    CREATE TABLE IF NOT EXISTS PESSOA (
        id INT PRIMARY KEY AUTO_INCREMENT,
        nome VARCHAR(80) NOT NULL,
        tipoPessoa VARCHAR(1),
        cpfCnpj VARCHAR(14),
        telefone VARCHAR(20),
        endereco VARCHAR(80),
        enderecoNum INT,
        bairro VARCHAR(50),
        cidadeId INT,
        cliente TINYINT,
        fornecedor TINYINT,
        registroAtivo TINYINT,
        column_3 data_type DEFAULT 0,
        CONSTRAINT (pessoaCidadefk)
            FOREIGN KEY (cidadeId)
            REFERENCES CIDADE(id)
    );

    CREATE TABLE IF NOT EXISTS TIPOTITULO (
        id INT PRIMARY KEY AUTO_INCREMENT,
        nome VARCHAR(50)
    );

    CREATE TABLE IF NOT EXISTS CATEGORIA (
        id INT PRIMARY KEY AUTO_INCREMENT,
        nome VARCHAR(50),
        registroAtivo TINYINT
    );
    CREATE TABLE IF NOT EXISTS TITULO (
        id INT PRIMARY KEY AUTO_INCREMENT,
        numeroTitulo INT,
        numeroParcela INT,
        tipoTituloId INT,
        pessoaId INT,
        categoriaId INT,
        dHCadastro TIMESTAMP,
        dataVencimento DATE,
        valor DECIMAL(9,2),
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