package com.motorgrid.granja.repository;

import com.motorgrid.granja.entity.TarefaEntity;
import com.motorgrid.granja.model.Tarefa;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface TarefaRepository extends JpaRepository<TarefaEntity, Long> {
    
}
