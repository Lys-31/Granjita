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

    public static Lote criarLote(LoteEntity loteEntity) {
        return Lote.builder()
                .id(loteEntity.getId())
                .codigo(loteEntity.getCodigo())
                .dataEntrada(loteEntity.getDataEntrada())
                .dataPrevisaoSaida(loteEntity.getDataPrevisaoSaida())
                .build();
    }
}
