package com.firstapp.firstspringapp.dto;

import com.firstapp.firstspringapp.entity.Persona;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonaDto {
    private String nombre;
    private String apellido;
}
