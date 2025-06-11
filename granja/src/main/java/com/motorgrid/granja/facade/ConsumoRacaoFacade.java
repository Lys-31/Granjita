package com.motorgrid.granja.facade;

import com.motorgrid.granja.application.ConsumoRacaoApplication;
import com.motorgrid.granja.entity.ConsumoRacaoEntity;
import com.motorgrid.granja.model.ConsumoRacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConsumoRacaoFacade {
    private ConsumoRacaoApplication consumoRacaoApplication;

    @Autowired
    public ConsumoRacaoFacade(ConsumoRacaoApplication consumoRacaoApplication) {
        this.consumoRacaoApplication = consumoRacaoApplication;
    }

    public ConsumoRacaoEntity save(ConsumoRacao consumoRacao) {
        return consumoRacaoApplication.save(consumoRacao);
    }

    public ConsumoRacaoEntity update(Long id, ConsumoRacao consumoRacao) {

        return consumoRacaoApplication.update(id, consumoRacao);
    }

    public ConsumoRacaoEntity findById(Long id) {
        return consumoRacaoApplication.findById(id);
    }

    public List<ConsumoRacaoEntity> findAll() {
        return consumoRacaoApplication.findAll();
    }

    public void delete(Long id) {
        consumoRacaoApplication.delete(id);
    }
}
