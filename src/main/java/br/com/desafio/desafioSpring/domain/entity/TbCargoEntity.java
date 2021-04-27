package br.com.desafio.desafioSpring.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "TB_CARGO")
public class TbCargoEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CARGO_ID")
	private Integer cargoId;
	
	@Column(name = "CARGO_NAME")
	private String cargoName;
}
