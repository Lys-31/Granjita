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

import com.motorgrid.granja.facade.TarefaFacade;
import com.motorgrid.granja.entity.TarefaEntity;
import com.motorgrid.granja.model.Tarefa;

@RestController
@RequestScope
@CrossOrigin
@RequestMapping("/api/tarefa")
public class TarefaController {
    private TarefaFacade TarefaFacade;

    @Autowired
    public TarefaController (TarefaFacade TarefaFacade){
        this.TarefaFacade = TarefaFacade;
    }

    @PostMapping("/save")
    public TarefaEntity save(@RequestBody Tarefa Tarefa) {
        return TarefaFacade.save(Tarefa);
    }

    @PutMapping("/update/{id}")
    public TarefaEntity update(@PathVariable Long id, @RequestBody Tarefa Tarefa) {
        return TarefaFacade.update(id, Tarefa);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        TarefaFacade.delete(id);
    }

    @GetMapping("/find/{id}")
    public TarefaEntity findById(@PathVariable Long id) {
        return TarefaFacade.findById(id);
    }

    @GetMapping("/findAll")
    public List<TarefaEntity> findAll() {
        return TarefaFacade.findAll();
    }
}



