package br.com.xp.modulodeavaliacao.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "avaliacao_apresentacao")
public class AvaliacaoDaApresentacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column
    private BigDecimal exposicao;

    @NotNull
    @Column
    private BigDecimal arguicao;

    @NotNull
    @Column
    private BigDecimal tempo;

    @NotNull
    @Column
    private BigDecimal total;

    @NotEmpty
    @Column(name = "comentario_exposicao")
    private String comentarioDaExposicao;

    @NotEmpty
    @Column(name = "comentario_arguicao")
    private String comentarioDaArguicao;

    @NotEmpty
    @Column(name = "comentario_tempo")
    private String comentarioDoTempo;
}
