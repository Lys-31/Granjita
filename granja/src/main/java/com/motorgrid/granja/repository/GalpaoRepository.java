package com.motorgrid.granja.repository;

import com.motorgrid.granja.entity.GalpaoEntity;
import com.motorgrid.granja.model.Galpao;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface GalpaoRepository extends JpaRepository<GalpaoEntity, Long> {
    
}