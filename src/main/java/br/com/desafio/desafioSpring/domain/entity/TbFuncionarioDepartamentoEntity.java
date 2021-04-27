package br.com.desafio.desafioSpring.domain.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TB_FUNCIONARIO_DEPARTAMENTO")
public class TbFuncionarioDepartamentoEntity {

    @Id
    private Integer idDepto;

    @OneToOne
    @JoinColumn(name = "DEPARTAMENTO_ID")
    private TbDepartamentoEntity departamentoId;

    @OneToMany
    @JoinColumn(name = "FUNCIONARIO_ID")
    private TbFuncionarioDepartamentoEntity funcionarioId;
}
