package com.habitlife.habitservice.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.habitlife.habitservice.model.dto.UsuarioRequestDTO;
import com.habitlife.habitservice.model.dto.UsuarioResponseDTO;
import com.habitlife.habitservice.model.entity.Cliente;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class UsuarioMapper {

    private final ModelMapper modelMapper;
    
    public Cliente convertToEntity(UsuarioRequestDTO usuarioRequestDTO){
        return modelMapper.map(usuarioRequestDTO, Cliente.class);
    }

    public UsuarioResponseDTO convertToDTO(Cliente usuario){
        return modelMapper.map(usuario, UsuarioResponseDTO.class);
    }

    public List<UsuarioResponseDTO> convertToDTO(List<Cliente> usuarios){

        return usuarios.stream()
            .map(this::convertToDTO)
            .toList();
    }
}
