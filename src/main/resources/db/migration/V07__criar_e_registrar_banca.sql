CREATE TABLE bancas (
        id INT NOT NULL AUTO_INCREMENT,
        portaria VARCHAR(20) NOT NULL,
        tcc_id INT,
        FOREIGN KEY(tcc_id) REFERENCES tccs(id),
        PRIMARY KEY(id)
) engine=InnoDB DEFAULT CHARSET=utf8;