package com.motorgrid.granja.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "racao")
public class RacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "quantidade_kg")
    private double quantidadeKg;

    @Column(name = "fornecedor")
    private String fornecedor;

    @ManyToOne
    @JoinColumn(name = "id_tipo_racao")
    private TipoRacaoEntity tipoRacaoEntity;
}
