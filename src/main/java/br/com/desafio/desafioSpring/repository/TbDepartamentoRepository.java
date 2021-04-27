package br.com.desafio.desafioSpring.repository;

import br.com.desafio.desafioSpring.domain.entity.TbDepartamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbDepartamentoRepository extends JpaRepository<TbDepartamentoEntity, Integer> {
}
