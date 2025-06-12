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

import com.motorgrid.granja.facade.FornecedorFacade;
import com.motorgrid.granja.entity.FornecedorEntity;
import com.motorgrid.granja.model.Fornecedor;

@RestController
@RequestScope
@CrossOrigin
@RequestMapping("/api/fornecedor")
public class FornecedorController {
    private FornecedorFacade FornecedorFacade;

    @Autowired
    public FornecedorController (FornecedorFacade FornecedorFacade){
        this.FornecedorFacade = FornecedorFacade;
    }

    @PostMapping("/save")
    public FornecedorEntity save(@RequestBody Fornecedor Fornecedor) {
        return FornecedorFacade.save(Fornecedor);
    }

    @PutMapping("/update/{id}")
    public FornecedorEntity update(@PathVariable Long id, @RequestBody Fornecedor Fornecedor) {
        return FornecedorFacade.update(id, Fornecedor);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        FornecedorFacade.delete(id);
    }

    @GetMapping("/find/{id}")
    public FornecedorEntity findById(@PathVariable Long id) {
        return FornecedorFacade.findById(id);
    }

    @GetMapping("/findAll")
    public List<FornecedorEntity> findAll() {
        return FornecedorFacade.findAll();
    }
}



