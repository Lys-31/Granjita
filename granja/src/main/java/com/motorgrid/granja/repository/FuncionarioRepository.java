package com.motorgrid.granja.repository;

import com.motorgrid.granja.entity.FuncionarioEntity;
import com.motorgrid.granja.model.Funcionario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Long> {
   
}