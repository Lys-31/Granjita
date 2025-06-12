package com.motorgrid.granja.repository;

import com.motorgrid.granja.entity.ColetaOvosEntity;
import com.motorgrid.granja.entity.LoteEntity;
import com.motorgrid.granja.model.ColetaOvos;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface ColetaOvosRepository extends JpaRepository<ColetaOvosEntity, Long> {
    public List<ColetaOvosEntity> findByLoteEntity(LoteEntity loteEntity);
}