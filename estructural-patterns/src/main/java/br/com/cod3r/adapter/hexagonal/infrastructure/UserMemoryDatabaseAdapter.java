package br.com.cod3r.adapter.hexagonal.infrastructure;

import br.com.cod3r.adapter.hexagonal.core.model.User;
import br.com.cod3r.adapter.hexagonal.core.ports.UserRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class UserMemoryDatabaseAdapter implements UserRepository {

    private Map<String, User> memoryUsers = new HashMap<>();

    @Override
    public void save(User user) {
        memoryUsers.put(user.getEmail(), user);
    }

    @Override
    public boolean existsByEmail(String email) {
        return memoryUsers.containsKey(email);
    }

    @Override
    public List<User> getAll() {
        return memoryUsers.values().stream().toList();
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.ofNullable(memoryUsers.get(email));
    }
}
