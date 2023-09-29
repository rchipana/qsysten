package com.qsysten.demo.service;


import com.qsysten.demo.commom.BaseResponse;
import com.qsysten.demo.dto.PersonaDto;
import com.qsysten.demo.dto.ResponseDto;
import com.qsysten.demo.entity.Persona;
import com.qsysten.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    /*
    Ejercicio #3 ----------- INICIO-----------------
     Se necesita que diferentes comportamientos bajo una misma firma(declaración de método) estén accesibles
     a una aplicación y puedan ser llamados de manera rápida y clara.

     */

    public BaseResponse<ResponseDto> persona(boolean dni, boolean paterno, String centro) {

        /*
         Ejercicio # 1  ----------- INICIO-----------------
         Crear una lista del Objeto Persona (dni, appPaterno, appMatterno) y
         deberás ordenar la lista por DNI y de ahí por apellido paterno, pintando
         la lista desordenada y de ahí ordenada

         */

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
        /*
           Ejercicio # 1----------- FIN -----------------
         */


        /* Ejercicio # 2 ----------- INICIO-----------------
        Se necesita un método que reciba el nombre del centro de distribución y que de acuerdo con el nombre del centro de distribución realice
        un comportamiento especifico al centro de distribución (puedes pintar un simple texto).Lista de nombres de los centros de distribución:
        LURIN, ICA, TRUJILLO, HUANUCO

         */

        if (centro.equalsIgnoreCase("LURIN")) responseDto.setCentro("centro de distribucion LURIN");
        if (centro.equalsIgnoreCase("ICA")) responseDto.setCentro("centro de distribucion ICA");
        if (centro.equalsIgnoreCase("TRUJILLO")) responseDto.setCentro("centro de distribucion TRUJILLO");
        if (centro.equalsIgnoreCase("HUANUCO")) responseDto.setCentro("centro de distribucion HUANUCO");

        /*
           Ejercicio # 2 --------FIN---------
         */

        return new BaseResponse<ResponseDto>().ok(responseDto);
    }

    /*
      Ejercicio #3 FIN-----------------
     */
}
