CREATE TABLE defesas (
        id INT NOT NULL AUTO_INCREMENT,
        local VARCHAR(100) NOT NULL,
        data DATE NOT NULL,
        status VARCHAR(20) NOT NULL,
        banca_id INT,
        FOREIGN KEY(banca_id) REFERENCES bancas(id),
        PRIMARY KEY(id)
) engine=InnoDB DEFAULT CHARSET=utf8;