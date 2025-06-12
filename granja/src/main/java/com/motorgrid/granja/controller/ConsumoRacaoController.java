package com.motorgrid.granja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

import com.motorgrid.granja.facade.ConsumoRacaoFacade;
import com.motorgrid.granja.entity.ConsumoRacaoEntity;
import com.motorgrid.granja.model.ConsumoRacao;

@RestController
@RequestScope
@CrossOrigin
@RequestMapping("/api/consumo-racao")
public class ConsumoRacaoController {
    private ConsumoRacaoFacade consumoRacaoFacade;

    @Autowired
    public ConsumoRacaoController (ConsumoRacaoFacade consumoRacaoFacade){
        this.consumoRacaoFacade = consumoRacaoFacade;
    }

    @PostMapping("/save")
    public ConsumoRacaoEntity save(@RequestBody ConsumoRacao consumoRacao) {
        return consumoRacaoFacade.save(consumoRacao);
    }

    @PutMapping("/update/{id}")
    public ConsumoRacaoEntity update(@PathVariable Long id, @RequestBody ConsumoRacao consumoRacao) {
        return consumoRacaoFacade.update(id, consumoRacao);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        consumoRacaoFacade.delete(id);
    }

    @GetMapping("/find/{id}")
    public ConsumoRacaoEntity findById(@PathVariable Long id) {
        return consumoRacaoFacade.findById(id);
    }

    @GetMapping("/findAll")
    public List<ConsumoRacaoEntity> findAll() {
        return consumoRacaoFacade.findAll();
    }
}



