package br.com.desafio.desafioSpring.domain.dto;

import br.com.desafio.desafioSpring.domain.entity.TbDepartamentoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbDepartamentoDTO {

    private Integer departamentoId;
    private String departamentoName;

    public TbDepartamentoDTO(TbDepartamentoEntity departamentoEntity) {
        this.departamentoId = departamentoEntity.getDepartamentoId();
        this.departamentoName = departamentoEntity.getDepartamentoName();
    }
}
