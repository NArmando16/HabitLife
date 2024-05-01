package com.habitlife.habitservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanNutricionalResponseDTO {
    private Long id;
    private UsuarioResponseDTO usuarioplan;
    private String nombre;
    private String descripcion;
}
