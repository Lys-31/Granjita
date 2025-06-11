package com.motorgrid.granja.factory;

import com.motorgrid.granja.entity.FuncionarioEntity;
import com.motorgrid.granja.model.Funcionario;

public class FuncionarioFactory {
    public static FuncionarioEntity criarFuncionario(Funcionario funcionario) {
        return FuncionarioEntity.builder()
                .nome(funcionario.getNome())
                .cargo(funcionario.getCargo())
                .email(funcionario.getEmail())
                .role(funcionario.getRole())
                .dataContratacao(funcionario.getDataContratacao())
                .build();
    }
   
}
