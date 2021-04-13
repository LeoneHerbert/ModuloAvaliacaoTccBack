CREATE TABLE detalhe_bancas (
        id INT NOT NULL AUTO_INCREMENT,
        ordem_membro INT NOT NULL,
        banca_id INT,
        professor_id INT,
        FOREIGN KEY(banca_id) REFERENCES bancas(id),
        FOREIGN KEY(professor_id) REFERENCES professors(id),
        PRIMARY KEY(id)
) engine=InnoDB DEFAULT CHARSET=utf8;