package com.motorgrid.granja.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tarefa {
    private Long id;
    private String descricao;
    private String frequencia;

    public Tarefa validate() {
        if (this.descricao == null) {
            throw new IllegalArgumentException("Descricao nao pode ser nulo");
        }

        if (this.frequencia == null) {
            throw new IllegalArgumentException("Frequencia nao pode ser nulo");
        }
        return this;
    }


}
