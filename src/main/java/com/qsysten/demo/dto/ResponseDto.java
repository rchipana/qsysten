package com.qsysten.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
    private String centro;

    private List<PersonaDto> listDesordenada ;
    private List<PersonaDto> listOrdenadaDni ;

    private List<PersonaDto> listOrdenadaPaterno ;
    private List<PersonaDto> listOrdendaDniAndPaterno ;
}
