package com.habitlife.habitservice.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRequestDTO {
    @NotBlank(message = "El nombre del usuario no puede estar vacio")
    private String nombre;

    @NotBlank(message = "El apellido paterno del usuario no puede estar vacio")
    private String apellidoPaterno;

    @NotBlank(message = "El apellido materno del usuario no puede estar vacio")
    private String apellidoMaterno;

    @NotBlank(message = "El correo del usuario no puede estar vacio")
    @Email
    private String email;

    @NotBlank(message = "La edad del usuario no puede estar vacia")
    @Size(min=1, max=2, message = "La edad del usuario debe tener entre 1 y 2 caracteres")
    @Pattern(regexp = "[0-9]+", message = "La edad debe contener solo digitos")
    private int anios;

    @NotBlank(message = "El objetivo no puede estar vacio")
    private String objetivo;

    @NotBlank(message = "El plan del usuario no puede estar vacio")
    private boolean premium;
}
