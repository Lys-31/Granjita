package com.motorgrid.granja.repository;

import com.motorgrid.granja.entity.FornecedorEntity;
import com.motorgrid.granja.model.Fornecedor;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface FornecedorRepository extends JpaRepository<FornecedorEntity, Long> {
    
}
