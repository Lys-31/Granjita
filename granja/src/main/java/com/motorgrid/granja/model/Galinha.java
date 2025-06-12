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

    public Galinha validate() {
        if (this.identificacao == null) {
            throw new IllegalArgumentException("identificacao nao pode ser nulo");
        }
        if (this.dataNascimento == null) {
            throw new IllegalArgumentException("dataNascimento nao pode ser nulo");
        }
        if (this.statusSaude == null) {
            throw new IllegalArgumentException("statusSaude nao pode ser nulo");
        }
        return this;
    }
}
