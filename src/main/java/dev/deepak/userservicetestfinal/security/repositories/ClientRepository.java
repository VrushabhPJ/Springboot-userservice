package dev.deepak.userservicetestfinal.security.repositories;

import dev.deepak.userservicetestfinal.security.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {
    Optional<Client> findByClientId(String clientId);
}
