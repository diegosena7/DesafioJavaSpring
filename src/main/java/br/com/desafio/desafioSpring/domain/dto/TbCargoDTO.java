package br.com.desafio.desafioSpring.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbCargoDTO {

	private Integer cargoId;
	private String cargoName;
}
