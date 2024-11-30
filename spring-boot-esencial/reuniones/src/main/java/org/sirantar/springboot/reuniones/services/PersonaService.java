package org.sirantar.springboot.reuniones.services;


import org.sirantar.springboot.reuniones.model.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaService {

    private static final List<Persona> personas = new ArrayList<>();

    static {
        for (int i = 0; i < 5; i ++){
            personas.add(new Persona(i, "Nombre " + i, "Apellido " + i));
        }
    }

    public List<Persona> getAllPersonas() {
        return personas;
    }
}
