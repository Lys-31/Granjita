package com.motorgrid.granja.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Galpao {
    private Long id;
    private String nome;
    private int capacidadeMaxima;

    public Galpao validate() {
        if (this.capacidadeMaxima <= 0) {
            throw new IllegalArgumentException("capacidadeMaxima nao pode ser menor ou igual a zero");
        }
        if (this.nome == null) {
            throw new IllegalArgumentException("nome nao pode ser nulo");
        }
        return this;
    }
}
