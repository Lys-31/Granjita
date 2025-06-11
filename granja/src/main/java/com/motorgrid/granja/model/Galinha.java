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
public class Galinha {
    private Long id;
    private String identificacao;
    private LocalDate dataNascimento;
    private String statusSaude;
}
