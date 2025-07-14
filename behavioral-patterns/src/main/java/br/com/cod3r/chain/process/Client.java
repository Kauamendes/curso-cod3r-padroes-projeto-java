package br.com.cod3r.chain.process;

import br.com.cod3r.chain.process.service.GenericService;
import br.com.cod3r.chain.process.service.ProcessContext;
import br.com.cod3r.chain.process.service.ServicesCatalog;

public class Client {

	public static void main(String[] args) {
		ProcessContext context = new ProcessContext();
		context.put("email", "kaua@teste.com");
		context.put("senha", "teste123");
		Object response = GenericService.run(ServicesCatalog.saveUserProcess, context);
		System.out.println(response);

		context.reset();
		context.put("email", "anotherUser@email.com");
		context.put("password", "1234");
		context.put("name", "Another User");
		response = GenericService.run(ServicesCatalog.saveUserProcess, context);
		System.out.println(response);
	}
}
