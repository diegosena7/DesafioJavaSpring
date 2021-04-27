package br.com.desafio.desafioSpring.service;

import br.com.desafio.desafioSpring.domain.dto.TbDepartamentoDTO;
import br.com.desafio.desafioSpring.domain.entity.TbDepartamentoEntity;
import br.com.desafio.desafioSpring.repository.TbDepartamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class TbDepartamentoService {

    final private TbDepartamentoRepository repository;

    public List<TbDepartamentoDTO> buscaDepartamentos(){
        List<TbDepartamentoEntity> list = repository.findAll();
        return list.stream().map(depto -> new TbDepartamentoDTO(depto)).collect(Collectors.toList());
    }

    public TbDepartamentoEntity criaDepto(TbDepartamentoEntity depto){
        return repository.save(depto);
    }

    public TbDepartamentoEntity atualizaDepto(TbDepartamentoEntity departamentoEntity){
        return repository.save(departamentoEntity);
    }

    public void deletaDepto(Integer idDepto){
        repository.deleteById(idDepto);
    }
}
