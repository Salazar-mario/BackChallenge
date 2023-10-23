package com.challengeBackend.techforb.repository;

import com.challengeBackend.techforb.models.Transaccion;
import com.challengeBackend.techforb.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.util.Optional;


public interface TransaccionDAO extends JpaRepository<Transaccion,Integer> {

    @Query("SELECT t FROM Transaccion t WHERE t.usuarioDestinatario = :user OR t.usuarioRemitente = :user")
    List<Transaccion> findAllByUsuarioDestinarioIdOrUsuarioRemitenteId(@Param(value = "user")
    Optional<User> user);

    public List<Transaccion> findAllByUsuarioDestinatarioOrUsuarioRemitente(User user, User user0);
}
