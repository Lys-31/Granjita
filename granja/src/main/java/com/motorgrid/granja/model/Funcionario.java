package com.motorgrid.granja.model;

import java.time.LocalDate;

import com.motorgrid.granja.utils.enums.UserRole;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Funcionario {
    private Long id;
    private String nome;
    private String cargo;
    private LocalDate dataContratacao;
    private String email;
    private UserRole role;
}
