package br.com.desafio.desafioSpring.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.desafio.desafioSpring.domain.dto.TbCargoDTO;

@Service
public class TbCargoService {

	private List<TbCargoDTO> cargo = List.of(new TbCargoDTO(1, "Tecnologia Informação"));
	
	public List<TbCargoDTO> getCargos () {
		return cargo;
	}
	
	public TbCargoDTO cargosFindById (Long id) {

		return cargo.stream()
				.filter(cargo -> cargo.getCargoId().equals(id))
				.findFirst()
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Cargo não encontrado."));
	}

	public TbCargoDTO save(TbCargoDTO cargoDTO) {
		return null;
	}
	
	

}
