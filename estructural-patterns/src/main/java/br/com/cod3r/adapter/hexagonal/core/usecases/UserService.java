package br.com.cod3r.adapter.hexagonal.core.usecases;

import br.com.cod3r.adapter.hexagonal.core.model.User;
import br.com.cod3r.adapter.hexagonal.core.ports.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.getAll();
    }

    public void save(User user) {
        if (userRepository.existsByEmail(user.getEmail()))
            throw new RuntimeException("Email já existe");

        userRepository.save(user);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Usuário por email não encontrado!"));
    }
}
