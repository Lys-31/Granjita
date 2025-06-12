
package com.motorgrid.granja.application;

import com.motorgrid.granja.entity.GalpaoEntity;
import com.motorgrid.granja.factory.GalpaoFactory;
import com.motorgrid.granja.model.Galpao;
import com.motorgrid.granja.repository.GalpaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GalpaoApplication {
    private GalpaoRepository galpaoRepository;

    @Autowired
    public GalpaoApplication (GalpaoRepository galpaoRepository){
        this.galpaoRepository = galpaoRepository;
    }

    public GalpaoEntity save(Galpao galpao){
        return galpaoRepository.save(GalpaoFactory.criarGalpao(galpao.validate()));
    }

    public GalpaoEntity update(Long id, Galpao galpao){
        GalpaoEntity novo = GalpaoFactory.criarGalpao(galpao);
        novo.setId(id);
        return galpaoRepository.save(novo);
    }

    public GalpaoEntity findById(Long id){
        return galpaoRepository.findById(id).orElseThrow();
    }

    public List<GalpaoEntity> findAll(){
        return galpaoRepository.findAll();
    }

    public void delete(Long id){
        galpaoRepository.deleteById(id);
    }
}
