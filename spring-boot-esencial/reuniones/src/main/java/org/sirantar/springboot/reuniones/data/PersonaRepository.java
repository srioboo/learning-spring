package org.sirantar.springboot.reuniones.data;

import org.sirantar.springboot.reuniones.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
