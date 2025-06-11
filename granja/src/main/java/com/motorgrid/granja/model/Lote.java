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
}
