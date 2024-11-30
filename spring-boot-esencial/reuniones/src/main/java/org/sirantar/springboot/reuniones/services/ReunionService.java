package org.sirantar.springboot.reuniones.services;

import org.sirantar.springboot.reuniones.model.Persona;
import org.sirantar.springboot.reuniones.model.Reunion;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReunionService {

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

    public List<Reunion> getAllReuniones(){
        return reuniones;
    }
}
