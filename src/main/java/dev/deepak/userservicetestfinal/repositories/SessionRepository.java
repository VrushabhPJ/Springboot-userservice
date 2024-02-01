package dev.deepak.userservicetestfinal.repositories;

import dev.deepak.userservicetestfinal.models.Session;
import dev.deepak.userservicetestfinal.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {

    Optional<Session> findByTokenAndUser_Id(String token, Long userId);

    Optional<Session> countByUser(User user);

    //select * from sessions where token = <> and userId = <>
}
