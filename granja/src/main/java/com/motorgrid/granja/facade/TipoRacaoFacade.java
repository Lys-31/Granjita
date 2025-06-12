package com.motorgrid.granja.facade;

import com.motorgrid.granja.application.TipoRacaoApplication;
import com.motorgrid.granja.entity.TipoRacaoEntity;
import com.motorgrid.granja.model.TipoRacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TipoRacaoFacade {
    private TipoRacaoApplication TipoRacaoApplication;

    @Autowired
    public TipoRacaoFacade(TipoRacaoApplication TipoRacaoApplication) {
        this.TipoRacaoApplication = TipoRacaoApplication;
    }

    public TipoRacaoEntity save(TipoRacao TipoRacao) {
        return TipoRacaoApplication.save(TipoRacao);
    }

    public TipoRacaoEntity update(Long id, TipoRacao TipoRacao) {

        return TipoRacaoApplication.update(id, TipoRacao);
    }

    public TipoRacaoEntity findById(Long id) {
        return TipoRacaoApplication.findById(id);
    }

    public List<TipoRacaoEntity> findAll() {
        return TipoRacaoApplication.findAll();
    }

    public void delete(Long id) {
        TipoRacaoApplication.delete(id);
    }

    public TipoRacaoEntity findByNome(String nome){
       return TipoRacaoApplication.findByNome(nome);
    }
}
