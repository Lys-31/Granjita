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

import com.motorgrid.granja.facade.GalpaoFacade;
import com.motorgrid.granja.entity.GalpaoEntity;
import com.motorgrid.granja.model.Galpao;

@RestController
@RequestScope
@CrossOrigin
@RequestMapping("/api/galpao")
public class GalpaoController {
    private GalpaoFacade GalpaoFacade;

    @Autowired
    public GalpaoController (GalpaoFacade GalpaoFacade){
        this.GalpaoFacade = GalpaoFacade;
    }

    @PostMapping("/save")
    public GalpaoEntity save(@RequestBody Galpao Galpao) {
        return GalpaoFacade.save(Galpao);
    }

    @PutMapping("/update/{id}")
    public GalpaoEntity update(@PathVariable Long id, @RequestBody Galpao Galpao) {
        return GalpaoFacade.update(id, Galpao);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        GalpaoFacade.delete(id);
    }

    @GetMapping("/find/{id}")
    public GalpaoEntity findById(@PathVariable Long id) {
        return GalpaoFacade.findById(id);
    }

    @GetMapping("/findAll")
    public List<GalpaoEntity> findAll() {
        return GalpaoFacade.findAll();
    }
}



