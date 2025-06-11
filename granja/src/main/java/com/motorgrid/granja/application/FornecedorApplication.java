
package com.motorgrid.granja.application;

import com.motorgrid.granja.entity.FornecedorEntity;
import com.motorgrid.granja.factory.FornecedorFactory;
import com.motorgrid.granja.model.Fornecedor;
import com.motorgrid.granja.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FornecedorApplication {
    private FornecedorRepository fornecedorRepository;

    @Autowired
    public FornecedorApplication (FornecedorRepository fornecedorRepository){
        this.fornecedorRepository = fornecedorRepository;
    }

    public FornecedorEntity save(Fornecedor fornecedor){
        return fornecedorRepository.save(FornecedorFactory.criarFornecedor(fornecedor));
    }

    public FornecedorEntity update(Long id, Fornecedor fornecedor){
        FornecedorEntity novo = FornecedorFactory.criarFornecedor(fornecedor);
        novo.setId(id);
        return fornecedorRepository.save(novo);
    }

    public FornecedorEntity findById(Long id){
        return fornecedorRepository.findById(id).orElseThrow();
    }

    public List<FornecedorEntity> findAll(){
        return fornecedorRepository.findAll();
    }

    public void delete(Long id){
        fornecedorRepository.deleteById(id);
    }
}
