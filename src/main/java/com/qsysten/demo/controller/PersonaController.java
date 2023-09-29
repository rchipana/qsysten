package com.qsysten.demo.controller;



import com.qsysten.demo.commom.BaseResponse;
import com.qsysten.demo.dto.ResponseDto;
import com.qsysten.demo.service.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/qsysten")
public class PersonaController {


   private final PersonaServiceImpl personaService;
    @Autowired
    public PersonaController(PersonaServiceImpl personaService) {
        this.personaService = personaService;
    }

    @GetMapping
    public ResponseEntity<BaseResponse<ResponseDto>> getAll(@RequestParam(required = false, defaultValue = "false") boolean dni,
                                                            @RequestParam(required = false, defaultValue = "false") boolean paterno,
                                                            @RequestParam(required = false , defaultValue = "empty") String centro) {
        BaseResponse<ResponseDto> response = personaService.persona(dni, paterno, centro);
        return ResponseEntity.ok(response);
    }

}
