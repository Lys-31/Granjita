package com.motorgrid.granja.factory;

import com.motorgrid.granja.entity.TipoRacaoEntity;
import com.motorgrid.granja.model.TipoRacao;

public class TipoRacaoFactory {
    public static TipoRacaoEntity criarTipoRacao(TipoRacao tipoRacao) {
        return TipoRacaoEntity.builder()
                .nome(tipoRacao.getNome())
                .proteinaPct(tipoRacao.getProteinaPct())
                .build();
    }

    public static TipoRacao criarTipoRacao(TipoRacaoEntity tipoRacaoEntity) {
        return TipoRacao.builder()
                .id(tipoRacaoEntity.getId())
                .nome(tipoRacaoEntity.getNome())
                .proteinaPct(tipoRacaoEntity.getProteinaPct())
                .build();
    }
}
