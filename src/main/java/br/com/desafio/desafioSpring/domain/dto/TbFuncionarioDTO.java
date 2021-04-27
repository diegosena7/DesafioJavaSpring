package br.com.desafio.desafioSpring.domain.dto;

import br.com.desafio.desafioSpring.domain.entity.TbCargoEntity;
import br.com.desafio.desafioSpring.domain.entity.TbFuncionarioEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbFuncionarioDTO {

    private Integer funcionarioId;
    private String funcionarioName;
    private Integer funcionarioAge;
    private Date funcionarioBirthday;
    private String funcionarioDocument;
    private TbCargoEntity dadosCargo;

    public TbFuncionarioDTO(TbFuncionarioEntity funcionarioEntity) {
        this.funcionarioId = funcionarioEntity.getFuncionarioId();
        this.funcionarioName = funcionarioEntity.getFuncionarioName();
        this.funcionarioAge = funcionarioEntity.getFuncionarioAge();
        this.funcionarioBirthday = funcionarioEntity.getFuncionarioBirthday();
        this.funcionarioDocument = funcionarioEntity.getFuncionarioDocument();
        this.dadosCargo = funcionarioEntity.getCargoId();
    }
}
