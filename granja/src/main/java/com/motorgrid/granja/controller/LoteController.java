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

import com.motorgrid.granja.facade.LoteFacade;
import com.motorgrid.granja.entity.LoteEntity;
import com.motorgrid.granja.model.Lote;

@RestController
@RequestScope
@CrossOrigin
@RequestMapping("/api/lote")
public class LoteController {
    private LoteFacade LoteFacade;

    @Autowired
    public LoteController (LoteFacade LoteFacade){
        this.LoteFacade = LoteFacade;
    }

    @PostMapping("/save")
    public LoteEntity save(@RequestBody Lote Lote) {
        return LoteFacade.save(Lote);
    }

    @PutMapping("/update/{id}")
    public LoteEntity update(@PathVariable Long id, @RequestBody Lote Lote) {
        return LoteFacade.update(id, Lote);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        LoteFacade.delete(id);
    }

    @GetMapping("/find/{id}")
    public LoteEntity findById(@PathVariable Long id) {
        return LoteFacade.findById(id);
    }

    @GetMapping("/findAll")
    public List<LoteEntity> findAll() {
        return LoteFacade.findAll();
    }
}



