package br.com.cod3r.adapter.hexagonal.core.ports;

import br.com.cod3r.adapter.hexagonal.core.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    void save(User user);
    boolean existsByEmail(String email);
    List<User> getAll();
    Optional<User> findByEmail(String email);
}
