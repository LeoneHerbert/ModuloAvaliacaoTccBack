CREATE TABLE alunos (
        id INT NOT NULL AUTO_INCREMENT,
        matricula VARCHAR(15) NOT NULL,
        nome VARCHAR(80) NOT NULL,
        email VARCHAR(60) NOT NULL,
        curso_id INT,
        FOREIGN KEY(curso_id) REFERENCES cursos(id),
        PRIMARY KEY(id)
) engine=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO alunos (matricula, nome, email, curso_id) VALUES ('SI118236-21', 'Pedro Carlos Silveira', 'pedrosilveira@acad.ifma.edu.br',1);