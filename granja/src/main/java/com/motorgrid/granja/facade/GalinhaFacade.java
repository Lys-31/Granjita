package com.motorgrid.granja.facade;

import com.motorgrid.granja.application.GalinhaApplication;
import com.motorgrid.granja.entity.GalinhaEntity;
import com.motorgrid.granja.model.Galinha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GalinhaFacade {
    private GalinhaApplication GalinhaApplication;

    @Autowired
    public GalinhaFacade(GalinhaApplication GalinhaApplication) {
        this.GalinhaApplication = GalinhaApplication;
    }

    public GalinhaEntity save(Galinha Galinha) {
        return GalinhaApplication.save(Galinha);
    }

    public GalinhaEntity update(Long id, Galinha Galinha) {

        return GalinhaApplication.update(id, Galinha);
    }

    public GalinhaEntity findById(Long id) {
        return GalinhaApplication.findById(id);
    }

    public List<GalinhaEntity> findAll() {
        return GalinhaApplication.findAll();
    }

    public void delete(Long id) {
        GalinhaApplication.delete(id);
    }
}
