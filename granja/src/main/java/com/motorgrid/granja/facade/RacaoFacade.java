package com.motorgrid.granja.facade;

import com.motorgrid.granja.application.RacaoApplication;
import com.motorgrid.granja.entity.RacaoEntity;
import com.motorgrid.granja.model.Racao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RacaoFacade {
    private RacaoApplication RacaoApplication;

    @Autowired
    public RacaoFacade(RacaoApplication RacaoApplication) {
        this.RacaoApplication = RacaoApplication;
    }

    public RacaoEntity save(Racao Racao) {
        return RacaoApplication.save(Racao);
    }

    public RacaoEntity update(Long id, Racao Racao) {

        return RacaoApplication.update(id, Racao);
    }

    public RacaoEntity findById(Long id) {
        return RacaoApplication.findById(id);
    }

    public List<RacaoEntity> findAll() {
        return RacaoApplication.findAll();
    }

    public void delete(Long id) {
        RacaoApplication.delete(id);
    }
}
