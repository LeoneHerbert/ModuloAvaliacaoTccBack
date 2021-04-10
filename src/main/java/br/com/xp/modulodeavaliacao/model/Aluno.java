package br.com.xp.modulodeavaliacao.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column(unique = true)
    private String matricula;

    @NotEmpty
    @Column
    private String nome;

    @NotEmpty
    @Column(unique = true)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id")
    private Curso curso;
}
