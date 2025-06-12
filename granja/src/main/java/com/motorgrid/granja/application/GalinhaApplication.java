
package com.motorgrid.granja.application;

import com.motorgrid.granja.entity.GalinhaEntity;
import com.motorgrid.granja.factory.GalinhaFactory;
import com.motorgrid.granja.model.Galinha;
import com.motorgrid.granja.repository.GalinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GalinhaApplication {
    private GalinhaRepository galinhaRepository;

    @Autowired
    public GalinhaApplication (GalinhaRepository galinhaRepository){
        this.galinhaRepository = galinhaRepository;
    }

    public GalinhaEntity save(Galinha galinha){
        return galinhaRepository.save(GalinhaFactory.criarGalinha(galinha.validate()));
    }

    public GalinhaEntity update(Long id, Galinha galinha){
        GalinhaEntity novo = GalinhaFactory.criarGalinha(galinha);
        novo.setId(id);
        return galinhaRepository.save(novo);
    }

    public GalinhaEntity findById(Long id){
        return galinhaRepository.findById(id).orElseThrow();
    }

    public List<GalinhaEntity> findAll(){
        return galinhaRepository.findAll();
    }

    public void delete(Long id){
        galinhaRepository.deleteById(id);
    }
}
