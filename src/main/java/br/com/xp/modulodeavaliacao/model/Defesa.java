package br.com.xp.modulodeavaliacao.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "defesas")
public class Defesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column
    private String local;

    @NotNull
    @Column
    private LocalDate data;

    @NotEmpty
    @Column
    private String status;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "banca_id", nullable = false )
    private Banca banca;
}
