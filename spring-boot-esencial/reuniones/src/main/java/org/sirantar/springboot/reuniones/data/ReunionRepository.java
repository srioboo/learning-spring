package org.sirantar.springboot.reuniones.data;

import org.sirantar.springboot.reuniones.model.Reunion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "reuniones")
public interface ReunionRepository extends JpaRepository<Reunion, Long> {
}
