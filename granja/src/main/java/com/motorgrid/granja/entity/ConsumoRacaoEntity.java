package com.motorgrid.granja.entity;

import java.time.LocalDate;

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
@Table(name = "consumo_racao")
public class ConsumoRacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_lote")
    private LoteEntity loteEntity;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "quantidade")
    private double quantidadeKg;
}
