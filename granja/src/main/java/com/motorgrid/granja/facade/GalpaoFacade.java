package com.motorgrid.granja.facade;

import com.motorgrid.granja.application.GalpaoApplication;
import com.motorgrid.granja.entity.GalpaoEntity;
import com.motorgrid.granja.model.Galpao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GalpaoFacade {
    private GalpaoApplication galpaoApplication;

    @Autowired
    public GalpaoFacade(GalpaoApplication galpaoApplication) {
        this.galpaoApplication = galpaoApplication;
    }

    public GalpaoEntity save(Galpao galpao) {
        return galpaoApplication.save(galpao);
    }

    public GalpaoEntity update(Long id, Galpao galpao) {

        return galpaoApplication.update(id, galpao);
    }

    public GalpaoEntity findById(Long id) {
        return galpaoApplication.findById(id);
    }

    public List<GalpaoEntity> findAll() {
        return galpaoApplication.findAll();
    }

    public void delete(Long id) {
        galpaoApplication.delete(id);
    }
}
