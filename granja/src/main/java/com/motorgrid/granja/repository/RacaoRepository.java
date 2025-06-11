package com.motorgrid.granja.repository;

import com.motorgrid.granja.entity.RacaoEntity;
import com.motorgrid.granja.model.Racao;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface RacaoRepository extends JpaRepository<RacaoEntity, Long> {
     
}