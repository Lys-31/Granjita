package com.motorgrid.granja.factory;

import com.motorgrid.granja.entity.RacaoEntity;
import com.motorgrid.granja.model.Racao;

public class RacaoFactory {
 
     public static RacaoEntity criarRacao(Racao racao) {
         return RacaoEntity.builder()
                 .quantidadeKg(racao.getQuantidadeKg())
                 .fornecedor(racao.getFornecedor())
                 .tipoRacaoEntity(TipoRacaoFactory.criarTipoRacao(racao.getTipoRacao()))
                 .build();
     }

     public static Racao criarRacao(RacaoEntity racao) {
         return Racao.builder()
                 .id(racao.getId())
                 .quantidadeKg(racao.getQuantidadeKg())
                 .tipoRacao(TipoRacaoFactory.criarTipoRacao(racao.getTipoRacaoEntity()))
                 .fornecedor(racao.getFornecedor())
                 .build();
     }
}
