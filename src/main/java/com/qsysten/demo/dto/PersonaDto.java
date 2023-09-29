package com.qsysten.demo.dto;



import com.qsysten.demo.entity.Persona;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonaDto {
    private String dni;
    private String paterno;
    private String materno;

    public PersonaDto(Persona persona) {
        this.dni = persona.getDni();
        this.paterno = persona.getPaterno();
        this.materno = persona.getMaterno();
    }
}
