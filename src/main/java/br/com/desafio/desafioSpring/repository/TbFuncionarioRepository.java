package br.com.desafio.desafioSpring.repository;

import br.com.desafio.desafioSpring.domain.entity.TbFuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbFuncionarioRepository extends JpaRepository<TbFuncionarioEntity, Integer> {
}
