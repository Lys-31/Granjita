package com.motorgrid.granja.repository;

import com.motorgrid.granja.entity.TipoRacaoEntity;
import com.motorgrid.granja.model.TipoRacao;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface TipoRacaoRepository extends JpaRepository<TipoRacaoEntity, Long> {
   TipoRacaoEntity findByNome(String nome);
}
