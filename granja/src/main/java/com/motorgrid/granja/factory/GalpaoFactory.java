package com.motorgrid.granja.factory;

import com.motorgrid.granja.entity.GalpaoEntity;
import com.motorgrid.granja.model.Galpao;

public class GalpaoFactory {
    public static GalpaoEntity criarGalpao(Galpao galpao) {
        return GalpaoEntity.builder()
                .nome(galpao.getNome())
                .capacidadeMaxima(galpao.getCapacidadeMaxima())
                .build();
    }
   

    public static Galpao criarGalpao(GalpaoEntity galpaoEntity) {
        return Galpao.builder()
            
                .id(galpaoEntity.getId())
                .nome(galpaoEntity.getNome())
                .capacidadeMaxima(galpaoEntity.getCapacidadeMaxima())
                .build();
    }
}
