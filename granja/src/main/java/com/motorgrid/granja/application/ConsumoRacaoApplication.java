package com.motorgrid.granja.application;

import com.motorgrid.granja.entity.ConsumoRacaoEntity;
import com.motorgrid.granja.factory.ConsumoRacaoFactory;
import com.motorgrid.granja.model.ConsumoRacao;
import com.motorgrid.granja.repository.ConsumoRacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConsumoRacaoApplication {
    private ConsumoRacaoRepository consumoRacaoRepository;

    @Autowired
    public ConsumoRacaoApplication (ConsumoRacaoRepository consumoRacaoRepository){
        this.consumoRacaoRepository = consumoRacaoRepository;
    }

    public ConsumoRacaoEntity save(ConsumoRacao consumoRacao){
        return consumoRacaoRepository.save(ConsumoRacaoFactory.criarConsumoRacao(consumoRacao));
    }

    public ConsumoRacaoEntity update(Long id, ConsumoRacao ConsumoRacao){
        ConsumoRacaoEntity novo = ConsumoRacaoFactory.criarConsumoRacao(ConsumoRacao);
        novo.setId(id);
        return consumoRacaoRepository.save(novo);
    }

    public ConsumoRacaoEntity findById(Long id){
        return consumoRacaoRepository.findById(id).orElseThrow();
    }

    public List<ConsumoRacaoEntity> findAll(){
        return consumoRacaoRepository.findAll();
    }

    public void delete(Long id){
        consumoRacaoRepository.deleteById(id);
    }
}
