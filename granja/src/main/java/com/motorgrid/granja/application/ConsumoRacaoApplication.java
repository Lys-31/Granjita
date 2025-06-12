package com.motorgrid.granja.application;

import com.motorgrid.granja.entity.ConsumoRacaoEntity;
import com.motorgrid.granja.factory.ConsumoRacaoFactory;
import com.motorgrid.granja.model.ConsumoRacao;
import com.motorgrid.granja.repository.ConsumoRacaoRepository;
import com.motorgrid.granja.repository.LoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConsumoRacaoApplication {
    private ConsumoRacaoRepository consumoRacaoRepository;
    private LoteRepository loteRepository;
    @Autowired
    public ConsumoRacaoApplication (ConsumoRacaoRepository consumoRacaoRepository, LoteRepository loteRepository ){
        this.consumoRacaoRepository = consumoRacaoRepository;
        this.loteRepository = loteRepository;
    }

    public ConsumoRacaoEntity save(ConsumoRacao consumoRacao){
    
        if(loteRepository.findById(consumoRacao.getLote().getId()) == null){
            throw new IllegalArgumentException("Lote nao existe");
        }
        return consumoRacaoRepository.save(ConsumoRacaoFactory.criarConsumoRacao(consumoRacao.validate()));
    }

    

    public ConsumoRacaoEntity update(Long id, ConsumoRacao consumoRacao){
        if(loteRepository.findById(consumoRacao.getLote().getId()) == null){
            throw new IllegalArgumentException("Lote nao existe");
        }
        ConsumoRacaoEntity novo = ConsumoRacaoFactory.criarConsumoRacao(consumoRacao);
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
