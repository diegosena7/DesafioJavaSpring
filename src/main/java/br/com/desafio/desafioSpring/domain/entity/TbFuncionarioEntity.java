package br.com.desafio.desafioSpring.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "TB_FUNCIONARIO")
public class TbFuncionarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FUNCIONARIO_ID")
    private Integer funcionarioId;

    @Column(name = "FUNCIONARIO_NAME")
    private String funcionarioName;

    @Column(name = "FUNCIONARIO_AGE")
    private Integer funcionarioAge;

    @Column(name = "FUNCIONARIO_BIRTHDAY")
    private Date funcionarioBirthday;

    @Column(name = "FUNCIONARIO_DOCUMENT")
    private String funcionarioDocument;

    @ManyToMany
    @JoinColumn(name= "CARGO_ID")
    private TbCargoEntity cargoId;
}
