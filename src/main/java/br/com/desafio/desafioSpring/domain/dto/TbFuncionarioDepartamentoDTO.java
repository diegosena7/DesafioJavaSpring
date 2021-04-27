package br.com.desafio.desafioSpring.domain.dto;

import br.com.desafio.desafioSpring.domain.entity.TbDepartamentoEntity;
import br.com.desafio.desafioSpring.domain.entity.TbFuncionarioDepartamentoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbFuncionarioDepartamentoDTO {

    private Integer idDepto;
    private TbDepartamentoEntity departamentoId;
    private TbFuncionarioDepartamentoEntity funcionarioId;

    public TbFuncionarioDepartamentoDTO(TbFuncionarioDepartamentoEntity funcionarioDepartamento) {
        this.idDepto = funcionarioDepartamento.getIdDepto();
        this.departamentoId = funcionarioDepartamento.getDepartamentoId();
        this.funcionarioId = funcionarioDepartamento.getFuncionarioId();
    }
}
