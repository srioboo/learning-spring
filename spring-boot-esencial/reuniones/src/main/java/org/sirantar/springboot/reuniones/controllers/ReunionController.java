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
@RequestMapping("/reuniones")
public class ReunionController {

    private static final List<Reunion> reuniones = new ArrayList<>();

    static {
        for (int i = 0; i < 5; i++){
            Reunion reunion = new Reunion(i, "Reunión " + 1, ZonedDateTime.now().plusDays(i));
            for (int j = 0; j < i; j++) {
                reunion.addAsistentes(
                        new Persona(i+j, "Nombre " + i + j, "Apellido " + i + j ));
            }
            reuniones.add(reunion);
        }
    }

    @GetMapping
    public String getAllReuniones(Model model) {
        model.addAttribute("reuniones", reuniones);
        return "reuniones";
    }
}
