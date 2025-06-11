package com.motorgrid.granja.facade;

import com.motorgrid.granja.application.TarefaApplication;
import com.motorgrid.granja.entity.TarefaEntity;
import com.motorgrid.granja.model.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TarefaFacade {
    private TarefaApplication TarefaApplication;

    @Autowired
    public TarefaFacade(TarefaApplication TarefaApplication) {
        this.TarefaApplication = TarefaApplication;
    }

    public TarefaEntity save(Tarefa Tarefa) {
        return TarefaApplication.save(Tarefa);
    }

    public TarefaEntity update(Long id, Tarefa Tarefa) {

        return TarefaApplication.update(id, Tarefa);
    }

    public TarefaEntity findById(Long id) {
        return TarefaApplication.findById(id);
    }

    public List<TarefaEntity> findAll() {
        return TarefaApplication.findAll();
    }

    public void delete(Long id) {
        TarefaApplication.delete(id);
    }
}
