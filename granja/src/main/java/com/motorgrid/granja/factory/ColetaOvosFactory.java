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

}
