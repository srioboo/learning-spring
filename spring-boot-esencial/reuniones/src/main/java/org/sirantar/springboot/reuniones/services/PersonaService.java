package org.sirantar.springboot.reuniones.services;


import org.sirantar.springboot.reuniones.data.PersonaRepository;
import org.sirantar.springboot.reuniones.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }

    public Persona getById(long id) {
        return personaRepository.findById(id).get();
    }
}
