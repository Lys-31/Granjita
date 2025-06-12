package com.motorgrid.granja.application;

import com.motorgrid.granja.entity.ColetaOvosEntity;
import com.motorgrid.granja.factory.ColetaOvosFactory;
import com.motorgrid.granja.model.ColetaOvos;
import com.motorgrid.granja.model.Lote;
import com.motorgrid.granja.repository.ColetaOvosRepository;
import com.motorgrid.granja.repository.LoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ColetaOvosApplication {
    private ColetaOvosRepository coletaOvosRepository;
    private LoteRepository loteRepository;

    @Autowired
    public ColetaOvosApplication (ColetaOvosRepository coletaOvosRepository, LoteRepository loteRepository){
        this.coletaOvosRepository = coletaOvosRepository;
        this.loteRepository = loteRepository;
    }

    public ColetaOvosEntity save(ColetaOvos coletaOvos){
        if(loteRepository.findById(coletaOvos.getId()) == null) throw new IllegalArgumentException("Lote não existe");
        return coletaOvosRepository.save(ColetaOvosFactory.criarColetaOvos(coletaOvos.validate()));
    }


    public ColetaOvosEntity update(Long id, ColetaOvos coletaOvos){
        if(loteRepository.findById(coletaOvos.getId()) == null) throw new IllegalArgumentException("Lote não existe");

        ColetaOvosEntity novo = ColetaOvosFactory.criarColetaOvos(coletaOvos);
        novo.setId(id);
        return coletaOvosRepository.save(novo);
    }

    public ColetaOvosEntity findById(Long id){
        return coletaOvosRepository.findById(id).orElseThrow();
    }

    public List<ColetaOvosEntity> findByLoteEntity(Long id){
        return coletaOvosRepository.findByLoteEntity(loteRepository.findById(id).orElseThrow());
    }

    public List<ColetaOvosEntity> findAll(){
        return coletaOvosRepository.findAll();
    }
    
    public void delete(Long id){
        coletaOvosRepository.deleteById(id);
    }
}
