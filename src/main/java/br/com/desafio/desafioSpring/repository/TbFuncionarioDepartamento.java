package br.com.desafio.desafioSpring.repository;

import br.com.desafio.desafioSpring.domain.entity.TbFuncionarioDepartamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbFuncionarioDepartamento extends JpaRepository<TbFuncionarioDepartamentoEntity, Integer> {
}
