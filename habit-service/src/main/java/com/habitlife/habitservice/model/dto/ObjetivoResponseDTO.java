package com.habitlife.habitservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ObjetivoResponseDTO {
    private Long id;
    private UsuarioResponseDTO usuarioobjetivo;
    private String nombre;
    private String descripcion;
}
