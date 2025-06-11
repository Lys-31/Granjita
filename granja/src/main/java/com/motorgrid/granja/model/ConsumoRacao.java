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
}
