package br.com.xp.modulodeavaliacao.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "tccs")
public class Tcc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column
    private String tema;

    @NotEmpty
    @Column
    private String resumo;

    @NotEmpty
    @Column
    private String palavraschave;

    @NotNull
    @Column(name = "percentual_conclusao")
    private Integer percentualDeConclusao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @OneToOne(mappedBy = "tcc", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Banca banca;
}
