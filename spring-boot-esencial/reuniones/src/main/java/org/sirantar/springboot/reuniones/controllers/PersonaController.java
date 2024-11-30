package org.sirantar.springboot.reuniones.controllers;

import org.sirantar.springboot.reuniones.model.Persona;
import org.sirantar.springboot.reuniones.model.Reunion;
import org.sirantar.springboot.reuniones.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    public String getAllPersonas(Model model) {
        model.addAttribute("personas", personaService.getAllPersonas());
        return "personas";
    }
}
