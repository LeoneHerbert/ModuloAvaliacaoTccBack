package br.com.xp.modulodeavaliacao.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "tcc")
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

}
