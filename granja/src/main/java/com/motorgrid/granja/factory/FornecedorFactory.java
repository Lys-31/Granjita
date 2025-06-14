package com.motorgrid.granja.factory;

import com.motorgrid.granja.entity.FornecedorEntity;
import com.motorgrid.granja.model.Fornecedor;

public class FornecedorFactory {
    public static FornecedorEntity criarFornecedor(Fornecedor fornecedor) {
        return FornecedorEntity.builder()
                .nome(fornecedor.getNome())
                .contato(fornecedor.getContato())
                .build();
    }

    public static Fornecedor criarFornecedor(FornecedorEntity fornecedor) {
        return Fornecedor.builder()
                .id(fornecedor.getId())
                .nome(fornecedor.getNome())
                .contato(fornecedor.getContato())
                .build();
    }

}
