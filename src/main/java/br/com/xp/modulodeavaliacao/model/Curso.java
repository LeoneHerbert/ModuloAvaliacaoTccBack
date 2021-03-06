package br.com.xp.modulodeavaliacao.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column
    private String sigla;

    @NotEmpty
    @Column
    private String nome;

    @NotEmpty
    @Column
    private String formacao;

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private Set<Aluno> alunos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private Set<Professor> professores = new LinkedHashSet<>();
}
