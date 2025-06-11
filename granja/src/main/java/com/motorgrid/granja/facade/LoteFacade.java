package com.motorgrid.granja.facade;

import com.motorgrid.granja.application.LoteApplication;
import com.motorgrid.granja.entity.LoteEntity;
import com.motorgrid.granja.model.Lote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoteFacade {
    private LoteApplication LoteApplication;

    @Autowired
    public LoteFacade(LoteApplication LoteApplication) {
        this.LoteApplication = LoteApplication;
    }

    public LoteEntity save(Lote Lote) {
        return LoteApplication.save(Lote);
    }

    public LoteEntity update(Long id, Lote Lote) {

        return LoteApplication.update(id, Lote);
    }

    public LoteEntity findById(Long id) {
        return LoteApplication.findById(id);
    }

    public List<LoteEntity> findAll() {
        return LoteApplication.findAll();
    }

    public void delete(Long id) {
        LoteApplication.delete(id);
    }
}
