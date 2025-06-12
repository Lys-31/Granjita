package com.motorgrid.granja.factory;

import com.motorgrid.granja.entity.FuncionarioEntity;
import com.motorgrid.granja.model.Funcionario;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class FuncionarioFactory {
    public static FuncionarioEntity criarFuncionario(Funcionario funcionario) {
        return FuncionarioEntity.builder()
                .nome(funcionario.getNome())
                .cargo(funcionario.getCargo())
                .email(funcionario.getEmail())
                .senha(new BCryptPasswordEncoder().encode(funcionario.getSenha()))
                .role(funcionario.getRole())
                .dataContratacao(funcionario.getDataContratacao())
                .build();
    }
    
    public static Funcionario criarFuncionario(FuncionarioEntity funcionario) {
        return Funcionario.builder()
                .id(funcionario.getId())
                .nome(funcionario.getNome())
                .cargo(funcionario.getCargo())
                .email(funcionario.getEmail())
                .senha(funcionario.getSenha())
                .role(funcionario.getRole())
                .dataContratacao(funcionario.getDataContratacao())
                .build();
    }
}
