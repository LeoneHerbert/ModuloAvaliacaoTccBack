CREATE TABLE tccs (
        id INT NOT NULL AUTO_INCREMENT,
        tema VARCHAR(200) NOT NULL,
        resumo VARCHAR(500) NOT NULL,
        palavraschave VARCHAR(200) NOT NULL,
        percentual_conclusao INT NOT NULL,
        professor_id INT,
        aluno_id INT,
        FOREIGN KEY(professor_id) REFERENCES professors(id),
        FOREIGN KEY(aluno_id) REFERENCES alunos(id),
        PRIMARY KEY(id)
) engine=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tccs (tema, resumo, palavraschave, percentual_conclusao, professor_id, aluno_id) VALUES ('A Utilização do Algoritmo da Bolha para classificar textos.', 'Neste trabalho estudamos a aplicação do algoritmo da Bolha no processo de classificação alfabética de textos', 'algoritmo de classificação, ordenação alfabética, tempo de resposta',90,1,1);