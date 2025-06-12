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

import com.motorgrid.granja.facade.GalinhaFacade;
import com.motorgrid.granja.entity.GalinhaEntity;
import com.motorgrid.granja.model.Galinha;

@RestController
@RequestScope
@CrossOrigin
@RequestMapping("/api/galinha")
public class GalinhaController {
    private GalinhaFacade GalinhaFacade;

    @Autowired
    public GalinhaController (GalinhaFacade GalinhaFacade){
        this.GalinhaFacade = GalinhaFacade;
    }

    @PostMapping("/save")
    public GalinhaEntity save(@RequestBody Galinha Galinha) {
        return GalinhaFacade.save(Galinha);
    }

    @PutMapping("/update/{id}")
    public GalinhaEntity update(@PathVariable Long id, @RequestBody Galinha Galinha) {
        return GalinhaFacade.update(id, Galinha);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        GalinhaFacade.delete(id);
    }

    @GetMapping("/find/{id}")
    public GalinhaEntity findById(@PathVariable Long id) {
        return GalinhaFacade.findById(id);
    }

    @GetMapping("/findAll")
    public List<GalinhaEntity> findAll() {
        return GalinhaFacade.findAll();
    }
}



