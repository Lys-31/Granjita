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
    private String senha;
    private LocalDate dataContratacao;
    private String email;
    private UserRole role;

    public boolean validarEmail() {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }
    public boolean validarSenha() {
        return senha.length() >= 8;
    }
    public Funcionario validate(){
        if (this.email == null) {
            throw new IllegalArgumentException("email nao pode ser nulo");
        }
        if (this.senha == null) {
            throw new IllegalArgumentException("senha nao pode ser nulo");
        }

        return this;
    }
}
