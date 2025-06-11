package com.motorgrid.granja.facade;

import com.motorgrid.granja.application.FuncionarioApplication;
import com.motorgrid.granja.entity.FuncionarioEntity;
import com.motorgrid.granja.model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FuncionarioFacade {
    private FuncionarioApplication FuncionarioApplication;

    @Autowired
    public FuncionarioFacade(FuncionarioApplication FuncionarioApplication) {
        this.FuncionarioApplication = FuncionarioApplication;
    }

    public FuncionarioEntity save(Funcionario Funcionario) {
        return FuncionarioApplication.save(Funcionario);
    }

    public FuncionarioEntity update(Long id, Funcionario Funcionario) {

        return FuncionarioApplication.update(id, Funcionario);
    }

    public FuncionarioEntity findById(Long id) {
        return FuncionarioApplication.findById(id);
    }

    public List<FuncionarioEntity> findAll() {
        return FuncionarioApplication.findAll();
    }

    public void delete(Long id) {
        FuncionarioApplication.delete(id);
    }
}
