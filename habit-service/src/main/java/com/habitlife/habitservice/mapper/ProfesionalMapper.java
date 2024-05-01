package com.habitlife.habitservice.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.habitlife.habitservice.model.dto.ProfesionalRequestDTO;
import com.habitlife.habitservice.model.dto.ProfesionalResponseDTO;
import com.habitlife.habitservice.model.entity.Profesional;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ProfesionalMapper {
    private final ModelMapper modelMapper;
    
    public Profesional convertToEntity(ProfesionalRequestDTO ProfesionalRequestDTO){
        return modelMapper.map(ProfesionalRequestDTO, Profesional.class);
    }

    public ProfesionalResponseDTO convertToDTO(Profesional profesional){
        return modelMapper.map(profesional, ProfesionalResponseDTO.class);
    }

    public List<ProfesionalResponseDTO> convertToDTO(List<Profesional> profesionales){

        return profesionales.stream()
            .map(this::convertToDTO)
            .toList();
    }
}
