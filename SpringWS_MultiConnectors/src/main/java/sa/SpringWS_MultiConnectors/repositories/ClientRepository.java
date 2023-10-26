package sa.SpringWS_MultiConnectors.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sa.SpringWS_MultiConnectors.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
