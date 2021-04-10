package br.com.xp.modulodeavaliacao.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "bancas")
public class Banca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column(unique = true)
    private String portaria;

    @OneToOne(mappedBy = "banca", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Defesa defesa;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "tcc_id", nullable = false )
    private Tcc tcc;
}
