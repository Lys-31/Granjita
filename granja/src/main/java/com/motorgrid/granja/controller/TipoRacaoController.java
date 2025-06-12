package com.motorgrid.granja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.motorgrid.granja.facade.TipoRacaoFacade;
import com.motorgrid.granja.entity.TipoRacaoEntity;
import com.motorgrid.granja.model.TipoRacao;

@RestController
@RequestScope
@CrossOrigin
@RequestMapping("/api/tipo-racao")
public class TipoRacaoController {
    private TipoRacaoFacade TipoRacaoFacade;

    @Autowired
    public TipoRacaoController (TipoRacaoFacade TipoRacaoFacade){
        this.TipoRacaoFacade = TipoRacaoFacade;
    }

    @PostMapping("/save")
    public TipoRacaoEntity save(@RequestBody TipoRacao TipoRacao) {
        return TipoRacaoFacade.save(TipoRacao);
    }

    @PutMapping("/update/{id}")
    public TipoRacaoEntity update(@PathVariable Long id, @RequestBody TipoRacao TipoRacao) {
        return TipoRacaoFacade.update(id, TipoRacao);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        TipoRacaoFacade.delete(id);
    }

    @GetMapping("/find/{id}")
    public TipoRacaoEntity findById(@PathVariable Long id) {
        return TipoRacaoFacade.findById(id);
    }

    @GetMapping("/findByNome/{nome}")
    public TipoRacaoEntity findByNome(@PathVariable String nome) {
        return TipoRacaoFacade.findByNome(nome);
    }

    @GetMapping("/findAll")
    public List<TipoRacaoEntity> findAll() {
        return TipoRacaoFacade.findAll();
    }
}



