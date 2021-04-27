package br.com.desafio.desafioSpring.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.desafioSpring.domain.dto.TbCargoDTO;
import br.com.desafio.desafioSpring.service.TbCargoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("cargos")
public class TbCargoController {

	private final TbCargoService tbCargoService;
	
	@GetMapping
	public ResponseEntity<List<TbCargoDTO>> getCargos() {
		log.info("INFO - Buscando cargos");
		return ResponseEntity.ok(tbCargoService.getCargos());
	}
	
	
	@GetMapping(path = "/{cargoId}")
	public ResponseEntity<TbCargoDTO> cargoFindById(@PathVariable Long id) {
		log.info("INFO - Buscando cargo por {id}");
		return ResponseEntity.ok(tbCargoService.cargosFindById(id));
	}
	
	@PostMapping
	public ResponseEntity<TbCargoDTO> save(@RequestBody TbCargoDTO cargoDTO) {
		return new ResponseEntity<>(tbCargoService.save(cargoDTO), HttpStatus.CREATED) ;
	}
	
	
}
