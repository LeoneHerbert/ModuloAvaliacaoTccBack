CREATE TABLE cursos (
             id INT NOT NULL AUTO_INCREMENT,
             sigla VARCHAR(8) NOT NULL,
             nome VARCHAR(100) NOT NULL,
             formacao VARCHAR(100) NOT NULL,
             PRIMARY KEY (id)
) engine=InnoDB DEFAULT CHARSET=utf8;