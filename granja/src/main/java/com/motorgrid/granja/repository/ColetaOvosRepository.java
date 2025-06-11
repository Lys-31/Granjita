package com.motorgrid.granja.repository;

import com.motorgrid.granja.entity.ColetaOvosEntity;
import com.motorgrid.granja.model.ColetaOvos;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface ColetaOvosRepository extends JpaRepository<ColetaOvosEntity, Long> {
    
}