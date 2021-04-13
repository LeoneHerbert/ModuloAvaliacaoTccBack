CREATE TABLE titulacaos (
             id INT NOT NULL AUTO_INCREMENT,
             descricao VARCHAR(50) NOT NULL,
             abreviacao_masculino VARCHAR(10) NOT NULL,
             abreviacao_feminino VARCHAR(10) NOT NULL,
             PRIMARY KEY (id)
) engine=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO titulacaos (descricao,abreviacao_masculino,abreviacao_feminino) VALUES ('BACHAREL','Bel.','Bela.');
INSERT INTO titulacaos (descricao,abreviacao_masculino,abreviacao_feminino) VALUES ('ESPECIALIZAÇÃO','Esp.','Esp.');
INSERT INTO titulacaos (descricao,abreviacao_masculino,abreviacao_feminino) VALUES ('MESTRADO','Me.','Ma.');
INSERT INTO titulacaos (descricao,abreviacao_masculino,abreviacao_feminino) VALUES ('DOUTORADO','Dr.','Dra.');
INSERT INTO titulacaos (descricao,abreviacao_masculino,abreviacao_feminino) VALUES ('PÓS-DOUTORADO','Pós-Dr.','Pós-Dr.');