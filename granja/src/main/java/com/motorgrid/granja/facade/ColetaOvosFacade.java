package com.motorgrid.granja.facade;

import com.motorgrid.granja.application.ColetaOvosApplication;
import com.motorgrid.granja.entity.ColetaOvosEntity;
import com.motorgrid.granja.factory.ColetaOvosFactory;
import com.motorgrid.granja.model.ColetaOvos;
import com.motorgrid.granja.repository.ColetaOvosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ColetaOvosFacade {
    private ColetaOvosApplication coletaOvosApplication;

    @Autowired
    public ColetaOvosFacade(ColetaOvosApplication coletaOvosApplication) {
        this.coletaOvosApplication = coletaOvosApplication;
    }

    public ColetaOvosEntity save(ColetaOvos coletaOvos) {
        return coletaOvosApplication.save(coletaOvos);
    }

    public ColetaOvosEntity update(Long id, ColetaOvos coletaOvos) {

        return coletaOvosApplication.update(id, coletaOvos);
    }

    public ColetaOvosEntity findById(Long id) {
        return coletaOvosApplication.findById(id);
    }

    public List<ColetaOvosEntity> findAll() {
        return coletaOvosApplication.findAll();
    }

    public void delete(Long id) {
        coletaOvosApplication.delete(id);
    }
}
