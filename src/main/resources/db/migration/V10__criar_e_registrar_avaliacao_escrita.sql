CREATE TABLE avaliacao_escritas (
        id INT NOT NULL AUTO_INCREMENT,
        conteudo DECIMAL NOT NULL,
        redacao DECIMAL NOT NULL,
        normalizacao DECIMAL NOT NULL,
        total DECIMAL NOT NULL,
        comentario_conteudo VARCHAR(500) NOT NULL,
        comentario_redacao VARCHAR(500) NOT NULL,
        comentario_normalizacao VARCHAR(500) NOT NULL,
        detalhe_banca_id INT,
        FOREIGN KEY(detalhe_banca_id) REFERENCES detalhe_bancas(id),
        PRIMARY KEY(id)
) engine=InnoDB DEFAULT CHARSET=utf8;