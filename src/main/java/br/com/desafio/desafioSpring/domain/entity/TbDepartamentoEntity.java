package br.com.desafio.desafioSpring.domain.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TB_DEPARTAMENTO")
public class TbDepartamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEPARTAMENTO_ID")
    private Integer departamentoId;

    @Column(name = "DEPARTAMENTO_NAME")
    private String departamentoName;
}
