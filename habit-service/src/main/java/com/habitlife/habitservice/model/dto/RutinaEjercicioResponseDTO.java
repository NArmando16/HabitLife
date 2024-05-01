package com.habitlife.habitservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RutinaEjercicioResponseDTO {
    private Long id;
    private UsuarioResponseDTO usuariorutina;
    private String nombre;
    private String descripcion;
}
