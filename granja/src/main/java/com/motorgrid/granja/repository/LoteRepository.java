package com.motorgrid.granja.repository;

import com.motorgrid.granja.entity.LoteEntity;
import com.motorgrid.granja.model.Lote;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface LoteRepository extends JpaRepository<LoteEntity, Long> {
    
}
