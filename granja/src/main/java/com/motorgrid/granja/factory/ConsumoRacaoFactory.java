package com.motorgrid.granja.factory;

import com.motorgrid.granja.entity.ConsumoRacaoEntity;
import com.motorgrid.granja.model.ConsumoRacao;

public class ConsumoRacaoFactory {
    public static ConsumoRacaoEntity criarConsumoRacao(ConsumoRacao consumoRacao) {
        return ConsumoRacaoEntity.builder()
                .loteEntity(LoteFactory.criarLote(consumoRacao.getLote()))
                .data(consumoRacao.getData())
                .quantidadeKg(consumoRacao.getQuantidadeKg())
                .build();
    }

}
