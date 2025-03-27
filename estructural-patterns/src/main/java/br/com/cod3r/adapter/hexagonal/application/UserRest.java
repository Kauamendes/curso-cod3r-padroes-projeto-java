package br.com.cod3r.adapter.hexagonal.application;

import br.com.cod3r.adapter.hexagonal.core.model.User;
import br.com.cod3r.adapter.hexagonal.core.usecases.UserService;
import br.com.cod3r.adapter.hexagonal.infrastructure.UserMemoryDatabaseAdapter;
import lombok.RequiredArgsConstructor;

import java.util.Map;

public class UserRest {
	
	private final UserService userService;

    public UserRest() {
        this.userService = new UserService(new UserMemoryDatabaseAdapter());
    }

    public Integer post(Map<String, String> values) {
		try {
			User user = new User(values.get("name"), values.get("email"), values.get("password"));
			userService.save(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 400;
		}
		return 201;
	}

	public Integer get() {
		userService.getUsers().forEach(System.out::println);
		return 200;
	}
}
