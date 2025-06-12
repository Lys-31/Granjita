
package com.motorgrid.granja.application;

import com.motorgrid.granja.entity.RacaoEntity;
import com.motorgrid.granja.factory.RacaoFactory;
import com.motorgrid.granja.model.Racao;
import com.motorgrid.granja.repository.RacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RacaoApplication {
    private RacaoRepository racaoRepository;

    @Autowired
    public RacaoApplication (RacaoRepository racaoRepository){
        this.racaoRepository = racaoRepository;
    }

    public RacaoEntity save(Racao racao){
        return racaoRepository.save(RacaoFactory.criarRacao(racao.validate()));
    }

    public RacaoEntity update(Long id, Racao racao){
        RacaoEntity novo = RacaoFactory.criarRacao(racao);
        novo.setId(id);
        return racaoRepository.save(novo);
    }

    public RacaoEntity findById(Long id){
        return racaoRepository.findById(id).orElseThrow();
    }

    public List<RacaoEntity> findAll(){
        return racaoRepository.findAll();
    }

    public void delete(Long id){
        racaoRepository.deleteById(id);
    }
}
