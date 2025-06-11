package com.motorgrid.granja.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "coleta_ovos")
public class ColetaOvosEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "lote_id")
    private LoteEntity loteEntity;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "quantidade")
    private int quantidade;
}
