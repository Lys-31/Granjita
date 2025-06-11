package com.motorgrid.granja.factory;

import com.motorgrid.granja.entity.LoteEntity;
import com.motorgrid.granja.model.Lote;

public class LoteFactory {
    public static LoteEntity criarLote(Lote lote) {
        return LoteEntity.builder()
                .codigo(lote.getCodigo())
                .dataEntrada(lote.getDataEntrada())
                .dataPrevisaoSaida(lote.getDataPrevisaoSaida())
                .build();
    }
}
