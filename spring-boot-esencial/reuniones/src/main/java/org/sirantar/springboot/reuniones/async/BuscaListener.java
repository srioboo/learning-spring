package org.sirantar.springboot.reuniones.async;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.sirantar.springboot.reuniones.model.Persona;
import org.sirantar.springboot.reuniones.model.Reunion;
import org.sirantar.springboot.reuniones.services.PersonaService;
import org.sirantar.springboot.reuniones.services.ReunionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BuscaListener {
    private static final Logger LOG = LoggerFactory.getLogger(BuscaListener.class);

    private final ObjectMapper mapper; // for comvert string int object
    private final PersonaService personaService;
    private final ReunionService reunionService;

    public BuscaListener(ObjectMapper mapper, PersonaService personaService, ReunionService reunionService) {
        this.mapper = mapper;
        this.personaService = personaService;
        this.reunionService = reunionService;
    }

    public void recibirMensaje(String mensaje) {
        try {
            InfoBusca info = mapper.readValue(mensaje, InfoBusca.class);
            Persona persona = personaService.getById(info.getIdAsistente());
            Reunion reunion = reunionService.getById(info.getIdReunion());
            LOG.info("{} {} tiene una reunión a las {}",
                    persona.getNombre(),
                    persona.getApellidos(),
                    reunion.getFecha());
        } catch (JsonProcessingException e) {
            // throw new RuntimeException(e);
            LOG.warn("Mensaje incorrecto", e);
        }
    }
}
