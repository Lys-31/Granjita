
package com.motorgrid.granja.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.motorgrid.granja.entity.FuncionarioEntity;
import com.motorgrid.granja.factory.FuncionarioFactory;
import com.motorgrid.granja.model.Funcionario;
import com.motorgrid.granja.repository.FuncionarioRepository;

@Component
public class FuncionarioApplication {
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    public FuncionarioApplication (FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    public FuncionarioEntity save(Funcionario funcionario){
        if (funcionarioRepository.findByEmail(funcionario.getEmail()) != null) throw new RuntimeException("Já existe um funcionário com este email");
        
        return funcionarioRepository.save(FuncionarioFactory.criarFuncionario(funcionario));
    }

    public FuncionarioEntity update(Long id, Funcionario funcionario){
        FuncionarioEntity novo = FuncionarioFactory.criarFuncionario(funcionario);
        novo.setId(id);
        return funcionarioRepository.save(novo);
    }

    public FuncionarioEntity findById(Long id){
        return funcionarioRepository.findById(id).orElseThrow();
    }

    public List<FuncionarioEntity> findAll(){
        return funcionarioRepository.findAll();
    }
    public FuncionarioEntity findByEmail(String email){
        return funcionarioRepository.findByEmail(email);
    }

    public void delete(Long id){
        funcionarioRepository.deleteById(id);
    }
}
