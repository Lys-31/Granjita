package com.motorgrid.granja.application;

import com.motorgrid.granja.entity.ColetaOvosEntity;
import com.motorgrid.granja.factory.ColetaOvosFactory;
import com.motorgrid.granja.model.ColetaOvos;
import com.motorgrid.granja.repository.ColetaOvosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ColetaOvosApplication {
    private ColetaOvosRepository coletaOvosRepository;

    @Autowired
    public ColetaOvosApplication (ColetaOvosRepository coletaOvosRepository){
        this.coletaOvosRepository = coletaOvosRepository;
    }

    public ColetaOvosEntity save(ColetaOvos coletaOvos){
        return coletaOvosRepository.save(ColetaOvosFactory.criarColetaOvos(coletaOvos));
    }

    public ColetaOvosEntity update(Long id, ColetaOvos coletaOvos){
        ColetaOvosEntity novo = ColetaOvosFactory.criarColetaOvos(coletaOvos);
        novo.setId(id);
        return coletaOvosRepository.save(novo);
    }

    public ColetaOvosEntity findById(Long id){
        return coletaOvosRepository.findById(id).orElseThrow();
    }

    public List<ColetaOvosEntity> findAll(){
        return coletaOvosRepository.findAll();
    }
    
    public void delete(Long id){
        coletaOvosRepository.deleteById(id);
    }
}
