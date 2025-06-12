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

import com.motorgrid.granja.facade.RacaoFacade;
import com.motorgrid.granja.entity.RacaoEntity;
import com.motorgrid.granja.model.Racao;

@RestController
@RequestScope
@CrossOrigin
@RequestMapping("/api/racao")
public class RacaoController {
    private RacaoFacade RacaoFacade;

    @Autowired
    public RacaoController (RacaoFacade RacaoFacade){
        this.RacaoFacade = RacaoFacade;
    }

    @PostMapping("/save")
    public RacaoEntity save(@RequestBody Racao Racao) {
        return RacaoFacade.save(Racao);
    }

    @PutMapping("/update/{id}")
    public RacaoEntity update(@PathVariable Long id, @RequestBody Racao Racao) {
        return RacaoFacade.update(id, Racao);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        RacaoFacade.delete(id);
    }

    @GetMapping("/find/{id}")
    public RacaoEntity findById(@PathVariable Long id) {
        return RacaoFacade.findById(id);
    }

    @GetMapping("/findAll")
    public List<RacaoEntity> findAll() {
        return RacaoFacade.findAll();
    }
}



