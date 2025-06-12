package com.motorgrid.granja.factory;

import com.motorgrid.granja.entity.GalinhaEntity;
import com.motorgrid.granja.model.Galinha;

public class GalinhaFactory {
    public static GalinhaEntity criarGalinha(Galinha galinha) {
        return GalinhaEntity.builder()
                .identificacao(galinha.getIdentificacao())
                .dataNascimento(galinha.getDataNascimento())
                .statusSaude(galinha.getStatusSaude())
                .build();
    }

    public static Galinha criarGalinha(GalinhaEntity galinha) {
        return Galinha.builder()
                .id(galinha.getId())
                .identificacao(galinha.getIdentificacao())
                .dataNascimento(galinha.getDataNascimento())
                .statusSaude(galinha.getStatusSaude())
                .build();
    }
}
