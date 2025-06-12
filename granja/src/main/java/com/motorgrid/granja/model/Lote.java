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
public class Lote {
    private Long id;
    private String codigo;
    private LocalDate dataEntrada;
    private LocalDate dataPrevisaoSaida;

    public Lote validate() {
        if (this.dataEntrada == null) {
            throw new IllegalArgumentException("dataEntrada nao pode ser nulo");
        }

        if (this.dataPrevisaoSaida == null) {
            throw new IllegalArgumentException("dataPrevisaoSaida nao pode ser nulo");
        }

        if (this.codigo == null) {
            throw new IllegalArgumentException("codigo nao pode ser nulo");
        }
        return this;
    }
}
