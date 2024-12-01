package org.sirantar.springboot.reuniones.data;

import org.sirantar.springboot.reuniones.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "personas")
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
