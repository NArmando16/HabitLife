package com.habitlife.habitservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagoResponseDTO {

    private Long id;
    private UsuarioResponseDTO usuariopago;
    private String descripcion;
    private Double monto;
}
