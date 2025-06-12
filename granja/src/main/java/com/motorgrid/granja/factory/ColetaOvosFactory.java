package com.motorgrid.granja.factory;

import com.motorgrid.granja.entity.ColetaOvosEntity;
import com.motorgrid.granja.model.ColetaOvos;

public class ColetaOvosFactory {
    public static ColetaOvosEntity criarColetaOvos(ColetaOvos coletaOvos) {
        return ColetaOvosEntity.builder()
                .loteEntity(LoteFactory.criarLote(coletaOvos.getLote()))
                .data(coletaOvos.getData())
                .quantidade(coletaOvos.getQuantidade())
                .build();
    }

    public static ColetaOvos criarColetaOvos(ColetaOvosEntity coletaOvosEntity) {
        return ColetaOvos.builder()
                .id(coletaOvosEntity.getId())
                .lote(LoteFactory.criarLote(coletaOvosEntity.getLoteEntity()))
                .data(coletaOvosEntity.getData())
                .quantidade(coletaOvosEntity.getQuantidade())
                .build();
    }

}
