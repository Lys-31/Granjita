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

import com.motorgrid.granja.entity.ColetaOvosEntity;
import com.motorgrid.granja.facade.ColetaOvosFacade;
import com.motorgrid.granja.model.ColetaOvos;

@RestController
@RequestScope
@RequestMapping("/api/coleta-ovos")
@CrossOrigin
public class ColetaOvosController {
    private ColetaOvosFacade coletaOvosFacade;

    @Autowired
    public ColetaOvosController (ColetaOvosFacade coletaOvosFacade){
        this.coletaOvosFacade = coletaOvosFacade;
    }

    @PostMapping("/save")
    public ColetaOvosEntity save(@RequestBody ColetaOvos coletaOvos) {
        return coletaOvosFacade.save(coletaOvos);
    }

    @PutMapping("/update/{id}")
    public ColetaOvosEntity update(@PathVariable Long id, @RequestBody ColetaOvos coletaOvos) {
        return coletaOvosFacade.update(id, coletaOvos);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        coletaOvosFacade.delete(id);
    }

    @GetMapping("/find/{id}")
    public ColetaOvosEntity findById(@PathVariable Long id) {
        return coletaOvosFacade.findById(id);
    }

    @GetMapping("/findAll")
    public List<ColetaOvosEntity> findAll() {
        return coletaOvosFacade.findAll();
    }

    @GetMapping("/findByLoteEntity/{id}")
    public List<ColetaOvosEntity> findByLoteEntity(@PathVariable Long id) {
        return coletaOvosFacade.findByLoteEntity(id);
    }
}



