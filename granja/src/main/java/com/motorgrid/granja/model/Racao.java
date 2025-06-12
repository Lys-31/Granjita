package com.motorgrid.granja.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Racao {
    private Long id;
    private double quantidadeKg;
    private String fornecedor;
    private TipoRacao tipoRacao;

    public Racao validate() {
        if (this.quantidadeKg >= 0) {
            throw new IllegalArgumentException("Quantidade não pode ser menor ou igual a zero");
        }

        if (this.fornecedor == null) {
            throw new IllegalArgumentException("fornecedor nao pode ser nulo");
        }

        if (this.tipoRacao == null) {
            throw new IllegalArgumentException("tipoRacao nao pode ser nulo");
        }
        return this;
    }
}
