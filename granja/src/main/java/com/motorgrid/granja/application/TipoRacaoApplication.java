
package com.motorgrid.granja.application;

import com.motorgrid.granja.entity.TipoRacaoEntity;
import com.motorgrid.granja.factory.TipoRacaoFactory;
import com.motorgrid.granja.model.TipoRacao;
import com.motorgrid.granja.repository.TipoRacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TipoRacaoApplication {
    private TipoRacaoRepository tipoRacaoRepository;

    @Autowired
    public TipoRacaoApplication (TipoRacaoRepository tipoRacaoRepository){
        this.tipoRacaoRepository = tipoRacaoRepository;
    }

    public TipoRacaoEntity save(TipoRacao tipoRacao){
        return tipoRacaoRepository.save(TipoRacaoFactory.criarTipoRacao(tipoRacao));
    }

    public TipoRacaoEntity update(Long id, TipoRacao tipoRacao){
        TipoRacaoEntity novo = TipoRacaoFactory.criarTipoRacao(tipoRacao);
        novo.setId(id);
        return tipoRacaoRepository.save(novo);
    }

    public TipoRacaoEntity findById(Long id){
        return tipoRacaoRepository.findById(id).orElseThrow();
    }

    public List<TipoRacaoEntity> findAll(){
        return tipoRacaoRepository.findAll();
    }

    public void delete(Long id){
        tipoRacaoRepository.deleteById(id);
    }
}
