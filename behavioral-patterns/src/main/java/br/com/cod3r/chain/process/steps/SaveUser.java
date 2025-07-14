package br.com.cod3r.chain.process.steps;

import br.com.cod3r.chain.process.repository.UserRepository;
import br.com.cod3r.chain.process.service.ProcessContext;

import java.util.HashMap;
import java.util.Map;

public class SaveUser extends ProcessStep {
	
	public SaveUser(Object... args) {
		super(args);
	}

	@Override
	@SuppressWarnings("unchecked")
	public ProcessContext execute(ProcessContext context) throws Exception {
		Map<String, Object> userInput = new HashMap<>();
		userInput.put("name", context.get("name"));
		userInput.put("email", context.get("email"));
		userInput.put("password", context.get("password"));
		UserRepository.getInstance().saveUser(userInput);
		return next(context, String.format("User '%s' saved!", userInput.get("name")));
	}

}
