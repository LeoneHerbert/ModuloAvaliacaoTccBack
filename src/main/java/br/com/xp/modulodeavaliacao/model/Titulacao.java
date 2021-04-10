package br.com.xp.modulodeavaliacao.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "titulacaos")
public class Titulacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column
    private String descricao;

    @NotEmpty
    @Column(name = "abreviacao_masculino")
    private String abreviacaoMasculino;

    @NotEmpty
    @Column(name = "abreviacao_feminino")
    private String abreviacaoFeminino;

}
