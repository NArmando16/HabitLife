package com.habitlife.habitservice.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    
    @Column(name = "apellido_paterno", nullable = false)
    private String apellidoPaterno;

    
    @Column(name = "apellido_materno", nullable = false)
    private String apelldioMaterno;

    
    @Column(name = "email", nullable = false)
    private String email;

    
    @Column(name = "anios", nullable = false)
    private int anios;

    
    @Column(name = "fecha_registro", nullable = false)
    private LocalDate fechaRegistro;

    
    @Column(name = "direccion", nullable = false)
    private String direccion;

    
    @Column(name = "premium", nullable = false)
    private boolean premium;

    
    @Column(name = "fecha_premium", nullable = false)
    private LocalDate fechaPremium;

    @ManyToOne
    @JoinColumn(name = "telefono_id", nullable = false)
    private Telefono telefono;

    @ManyToOne
    @JoinColumn(name = "objetivo_id", nullable = false)
    private Objetivo objetivo;
}
