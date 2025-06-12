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

    public TipoRacao validate(){
        if(this.nome == null){
            throw new IllegalArgumentException("Nome nao pode ser nulo");
        }

        if(this.proteinaPct <= 0){
            throw new IllegalArgumentException("Proteina não pode ser menor ou igual a zero");
        }
        return this;
    }


}
