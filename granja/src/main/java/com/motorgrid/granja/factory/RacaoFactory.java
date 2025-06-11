package com.motorgrid.granja.factory;

import com.motorgrid.granja.entity.RacaoEntity;
import com.motorgrid.granja.model.Racao;

public class RacaoFactory {
 
     public static RacaoEntity criarRacao(Racao racao) {
         return RacaoEntity.builder()
                 .quantidadeKg(racao.getQuantidadeKg())
                 .fornecedor(racao.getFornecedor())
                 .build();
     }
}
