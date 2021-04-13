CREATE TABLE avaliacao_apresentacaos (
        id INT NOT NULL AUTO_INCREMENT,
        exposicao DECIMAL NOT NULL,
        arguicao DECIMAL NOT NULL,
        tempo DECIMAL NOT NULL,
        total DECIMAL NOT NULL,
        comentario_exposicao VARCHAR(500) NOT NULL,
        comentario_arguicao VARCHAR(500) NOT NULL,
        comentario_tempo VARCHAR(500) NOT NULL,
        detalhe_banca_id INT,
        FOREIGN KEY(detalhe_banca_id) REFERENCES detalhe_bancas(id),
        PRIMARY KEY(id)
) engine=InnoDB DEFAULT CHARSET=utf8;