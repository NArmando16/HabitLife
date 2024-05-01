package com.habitlife.habitservice.model.entity;

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
@Table(name = "profesionales")
public class Profesional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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
    private long fechaRegistro;

    @Column(name = "direccion", nullable = false)
    private String direccion;
    
    @ManyToOne
    @JoinColumn(name = "telefono_id", nullable = false)
    private Telefono telefono;

    @ManyToOne
    @JoinColumn(name = "especialidad_id", nullable = false)
    private Especialidad especialidad;

    @ManyToOne
    @JoinColumn(name = "rutina_ejercicio_id", nullable = false)
    private RutinaEjericio rutinaEjercicio;

    @ManyToOne
    @JoinColumn(name = "plan_nutricional_id", nullable = false)
    private PlanNutricional planNutricional;
}
