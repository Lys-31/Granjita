package com.motorgrid.granja.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoRacao {
    private Long id;
    private String nome;
    private double proteinaPct;
}
