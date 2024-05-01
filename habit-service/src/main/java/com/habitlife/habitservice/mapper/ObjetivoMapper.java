package com.habitlife.habitservice.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.habitlife.habitservice.model.dto.ObjetivoRequestDTO;
import com.habitlife.habitservice.model.dto.ObjetivoResponseDTO;
import com.habitlife.habitservice.model.entity.Objetivo;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ObjetivoMapper {
    private final ModelMapper modelMapper;
    
    public Objetivo convertToEntity(ObjetivoRequestDTO objetivoRequestDTO){
        return modelMapper.map(objetivoRequestDTO, Objetivo.class);
    }

    public ObjetivoResponseDTO convertToDTO(Objetivo objetivo){
        return modelMapper.map(objetivo, ObjetivoResponseDTO.class);
    }

    public List<ObjetivoResponseDTO> convertToDTO(List<Objetivo> objetivos){

        return objetivos.stream()
            .map(this::convertToDTO)
            .toList();
    }
}
