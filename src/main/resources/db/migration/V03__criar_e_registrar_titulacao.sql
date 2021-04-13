CREATE TABLE titulacaos (
             id INT NOT NULL AUTO_INCREMENT,
             descricao VARCHAR(50) NOT NULL,
             abreviacao_masculino VARCHAR(10) NOT NULL,
             abreviacao_feminino VARCHAR(10) NOT NULL,
             PRIMARY KEY (id)
) engine=InnoDB DEFAULT CHARSET=utf8;