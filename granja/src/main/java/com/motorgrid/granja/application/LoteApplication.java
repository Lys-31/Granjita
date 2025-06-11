
package com.motorgrid.granja.application;

import com.motorgrid.granja.entity.LoteEntity;
import com.motorgrid.granja.factory.LoteFactory;
import com.motorgrid.granja.model.Lote;
import com.motorgrid.granja.repository.LoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoteApplication {
    private LoteRepository loteRepository;

    @Autowired
    public LoteApplication (LoteRepository loteRepository){
        this.loteRepository = loteRepository;
    }

    public LoteEntity save(Lote lote){
        return loteRepository.save(LoteFactory.criarLote(lote));
    }

    public LoteEntity update(Long id, Lote lote){
        LoteEntity novo = LoteFactory.criarLote(lote);
        novo.setId(id);
        return loteRepository.save(novo);
    }

    public LoteEntity findById(Long id){
        return loteRepository.findById(id).orElseThrow();
    }

    public List<LoteEntity> findAll(){
        return loteRepository.findAll();
    }

    public void delete(Long id){
        loteRepository.deleteById(id);
    }
}
