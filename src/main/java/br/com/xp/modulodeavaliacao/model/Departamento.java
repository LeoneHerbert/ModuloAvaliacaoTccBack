package br.com.xp.modulodeavaliacao.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "departamentos")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column
    private String sigla;

    @NotEmpty
    @Column
    private String nome;

    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
    private Set<Professor> professores = new LinkedHashSet<>();
}
