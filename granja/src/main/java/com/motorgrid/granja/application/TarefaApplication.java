
package com.motorgrid.granja.application;

import com.motorgrid.granja.entity.TarefaEntity;
import com.motorgrid.granja.factory.TarefaFactory;
import com.motorgrid.granja.model.Tarefa;
import com.motorgrid.granja.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TarefaApplication {
    private TarefaRepository tarefaRepository;

    @Autowired
    public TarefaApplication (TarefaRepository tarefaRepository){
        this.tarefaRepository = tarefaRepository;
    }

    public TarefaEntity save(Tarefa tarefa){

        return tarefaRepository.save(TarefaFactory.criarTarefa(tarefa.validate()));
    }


    public TarefaEntity update(Long id, Tarefa tarefa){
        TarefaEntity novo = TarefaFactory.criarTarefa(tarefa);
        novo.setId(id);
        return tarefaRepository.save(novo);
    }

    public TarefaEntity findById(Long id){
        return tarefaRepository.findById(id).orElseThrow();
    }

    public List<TarefaEntity> findAll(){
        return tarefaRepository.findAll();
    }

    public void delete(Long id){
        tarefaRepository.deleteById(id);
    }
}
