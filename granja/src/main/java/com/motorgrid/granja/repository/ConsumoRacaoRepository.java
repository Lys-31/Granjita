package com.motorgrid.granja.repository;

import com.motorgrid.granja.entity.ConsumoRacaoEntity;
import com.motorgrid.granja.model.ConsumoRacao;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface ConsumoRacaoRepository extends JpaRepository<ConsumoRacaoEntity, Long> {
    
}
