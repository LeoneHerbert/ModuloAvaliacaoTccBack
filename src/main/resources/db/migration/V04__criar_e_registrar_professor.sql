CREATE TABLE professors (
        id INT NOT NULL AUTO_INCREMENT,
        matricula VARCHAR(7) NOT NULL,
        nome VARCHAR(80) NOT NULL,
        email VARCHAR(60) NOT NULL,
        telefone VARCHAR(15) NOT NULL,
        area_atuacao VARCHAR(200) NOT NULL,
        lattes VARCHAR(100) NOT NULL,
        curso_id INT,
        departamento_id INT,
        titulacao_id INT,
        FOREIGN KEY(curso_id) REFERENCES cursos(id),
        FOREIGN KEY(departamento_id) REFERENCES departamentos(id),
        FOREIGN KEY(titulacao_id) REFERENCES titulacaos(id),
        PRIMARY KEY(id)
) engine=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO professors (matricula, nome, email,telefone,area_atuacao,lattes,curso_id,departamento_id,titulacao_id) VALUES ('1982360', 'Mauro Lopes Carvalho Silva', 'maurosilva@ifma.edu.br','98 98125-3236','Sistemas Distribuídos, Desenvolvimento Mobile, Internet das Coisas','http://lattes.cnpq.br/9247560603541505',1,1,3);