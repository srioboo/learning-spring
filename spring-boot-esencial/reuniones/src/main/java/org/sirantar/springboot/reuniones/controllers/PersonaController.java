package org.sirantar.springboot.reuniones.controllers;

import org.sirantar.springboot.reuniones.model.Persona;
import org.sirantar.springboot.reuniones.model.Reunion;
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

    private static final List<Persona> personas = new ArrayList<>();

    static {
        for (int i = 0; i < 5; i ++){
            personas.add(new Persona(i, "Nombre " + i, "Apellido " + i));
        }
    }

    @GetMapping
    public String getAllPersonas(Model model) {
        model.addAttribute("personas", personas);
        return "personas";
    }
}
