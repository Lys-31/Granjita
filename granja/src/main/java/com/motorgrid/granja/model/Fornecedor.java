package com.motorgrid.granja.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Fornecedor {
    private Long id;
    private String nome;
    private String contato;

    public  Fornecedor validate() {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome do fornecedor é obrigatório.");
        }
        if (contato == null || contato.isEmpty()) {
            throw new IllegalArgumentException("O contato do fornecedor é obrigatório.");
        }
        return this;
    }
}
