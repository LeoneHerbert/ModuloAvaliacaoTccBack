package br.com.xp.modulodeavaliacao.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "professors")
public class Professor {
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

    @NotEmpty
    @Column
    private String telefone;

    @NotEmpty
    @Column(name = "area_atuacao")
    private String areaDeAtuacao;

    @NotEmpty
    @Column
    private String lattes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "titulacao_id")
    private Titulacao titulacao;
}
