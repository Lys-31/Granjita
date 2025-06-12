package com.motorgrid.granja.factory;

import com.motorgrid.granja.entity.TarefaEntity;
import com.motorgrid.granja.model.Tarefa;

public class TarefaFactory {
    public static TarefaEntity criarTarefa(Tarefa tarefa) {
        return TarefaEntity.builder()
                .descricao(tarefa.getDescricao())
                .frequencia(tarefa.getFrequencia())
                .build();
    }

    public static Tarefa criarTarefa(TarefaEntity tarefa) {
        return Tarefa.builder()
                .id(tarefa.getId())
                .descricao(tarefa.getDescricao())
                .frequencia(tarefa.getFrequencia())
                .build();
    }
}
