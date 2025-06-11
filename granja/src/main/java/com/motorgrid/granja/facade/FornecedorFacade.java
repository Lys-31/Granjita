package com.motorgrid.granja.facade;

import com.motorgrid.granja.application.FornecedorApplication;
import com.motorgrid.granja.entity.FornecedorEntity;
import com.motorgrid.granja.model.Fornecedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FornecedorFacade {
    private FornecedorApplication FornecedorApplication;

    @Autowired
    public FornecedorFacade(FornecedorApplication FornecedorApplication) {
        this.FornecedorApplication = FornecedorApplication;
    }

    public FornecedorEntity save(Fornecedor Fornecedor) {
        return FornecedorApplication.save(Fornecedor);
    }

    public FornecedorEntity update(Long id, Fornecedor Fornecedor) {

        return FornecedorApplication.update(id, Fornecedor);
    }

    public FornecedorEntity findById(Long id) {
        return FornecedorApplication.findById(id);
    }

    public List<FornecedorEntity> findAll() {
        return FornecedorApplication.findAll();
    }

    public void delete(Long id) {
        FornecedorApplication.delete(id);
    }
}
