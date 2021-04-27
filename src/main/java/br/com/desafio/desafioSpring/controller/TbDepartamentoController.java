package br.com.desafio.desafioSpring.controller;

import br.com.desafio.desafioSpring.domain.entity.TbDepartamentoEntity;
import br.com.desafio.desafioSpring.repository.TbDepartamentoRepository;
import br.com.desafio.desafioSpring.service.TbDepartamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/departamento")
public class TbDepartamentoController {

    final TbDepartamentoRepository departamentoRepository;
    final TbDepartamentoService departamentoService;

    @GetMapping
    public ResponseEntity<Page<TbDepartamentoEntity>> buscaDepto(Pageable pageable){
        Page<TbDepartamentoEntity> lista = departamentoRepository.findAll(pageable);
        return ResponseEntity.ok().body(lista);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TbDepartamentoEntity criaDepartamento (@RequestBody TbDepartamentoEntity entity){
        return departamentoService.criaDepto(entity);
    }
}
