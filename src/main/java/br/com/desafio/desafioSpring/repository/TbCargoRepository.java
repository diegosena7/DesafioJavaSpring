package br.com.desafio.desafioSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.desafio.desafioSpring.domain.entity.TbCargoEntity;

@Repository
public interface TbCargoRepository extends JpaRepository<TbCargoEntity, Integer>{

	
}
