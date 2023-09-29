package com.qsysten.demo.service;



import com.qsysten.demo.commom.BaseResponse;
import com.qsysten.demo.dto.PersonaDto;
import com.qsysten.demo.dto.ResponseDto;
import com.qsysten.demo.entity.Persona;
import com.qsysten.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaServiceImpl {

   private final PersonaRepository personaRepository;

    @Autowired
    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public BaseResponse<ResponseDto> persona(boolean dni, boolean paterno, String centro) {

        List<Persona> list = personaRepository.findAll();
        ResponseDto responseDto = new ResponseDto();
        responseDto.setListDesordenada(list.stream().map(PersonaDto::new).collect(Collectors.toList()));

        Comparator<Persona> persona_dni
                = Comparator.comparing(Persona::getDni);
        list.sort(persona_dni);
        responseDto.setListOrdenadaDni(list.stream().map(PersonaDto::new).collect(Collectors.toList()));

        Comparator<Persona> persona_paterno
                = Comparator.comparing(Persona::getPaterno);
        list.sort(persona_paterno);
        responseDto.setListOrdenadaPaterno(list.stream().map(PersonaDto::new).collect(Collectors.toList()));

        Comparator<Persona> persona_dni_paterno_Comparator
                = Comparator.comparing(Persona::getDni)
                .thenComparing(Persona::getPaterno);
        list.sort(persona_dni_paterno_Comparator);
        responseDto.setListOrdendaDniAndPaterno(list.stream().map(PersonaDto::new).collect(Collectors.toList()));

        if (centro.equalsIgnoreCase("LURIN")) responseDto.setCentro("centro de distribucion LURIN");
        if (centro.equalsIgnoreCase("ICA")) responseDto.setCentro("centro de distribucion ICA");
        if (centro.equalsIgnoreCase("TRUJILLO")) responseDto.setCentro("centro de distribucion TRUJILLO");
        if (centro.equalsIgnoreCase("HUANUCO")) responseDto.setCentro("centro de distribucion HUANUCO");

        return new BaseResponse<ResponseDto>().ok(responseDto);
    }
}
