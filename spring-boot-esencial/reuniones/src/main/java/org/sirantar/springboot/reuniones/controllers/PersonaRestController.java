package org.sirantar.springboot.reuniones.controllers;

import org.sirantar.springboot.reuniones.model.Persona;
import org.sirantar.springboot.reuniones.services.PersonaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonaRestController {

    private PersonaService personaService;

    public PersonaRestController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping
    public List<Persona> getAllPersonas(){
        return personaService.getAllPersonas();
    }
}
