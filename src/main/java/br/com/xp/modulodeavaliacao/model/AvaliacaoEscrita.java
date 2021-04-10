package br.com.xp.modulodeavaliacao.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "avaliacao_escrita")
public class AvaliacaoEscrita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column
    private BigDecimal conteudo;

    @NotNull
    @Column
    private BigDecimal redacao;

    @NotNull
    @Column
    private BigDecimal normalizacao;

    @NotNull
    @Column
    private BigDecimal total;

    @NotEmpty
    @Column(name = "comentario_conteudo")
    private String comentarioDoConteudo;

    @NotEmpty
    @Column(name = "comentario_redacao")
    private String comentarioDaRedacao;

    @NotEmpty
    @Column(name = "comentario_normalizacao")
    private String comentarioDaNormalizacao;
}
