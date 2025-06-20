package com.motorgrid.granja.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsumoRacao {
    private Long id;
    private Lote lote;
    private LocalDate data;
    private double quantidadeKg;

    public ConsumoRacao validate() {
        if (lote == null) {
            throw new IllegalArgumentException("Lote não pode ser nulo");
        }
        if (data == null) {
            throw new IllegalArgumentException("Data não pode ser nulo");
        }
        if (quantidadeKg <= 0) {
            throw new IllegalArgumentException("Quantidade não pode ser menor ou igual a zero");
        }
        return this;
    }
}
