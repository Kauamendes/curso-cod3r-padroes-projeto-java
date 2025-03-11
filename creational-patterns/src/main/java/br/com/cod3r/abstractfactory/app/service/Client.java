package br.com.cod3r.abstractfactory.app.service;

import br.com.cod3r.abstractfactory.app.service.factory.EJBAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.RestAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {
		ServicesAbstractFactory ejbAbstractFactory = new EJBAbstractFactory();
		ServicesAbstractFactory restAbstractService = new RestAbstractFactory();

		UserService ejbUserService = ejbAbstractFactory.getUserService();
		UserService restUserService = restAbstractService.getUserService();

		System.out.println("### Salvando usuário com EJB");
		ejbUserService.save("Usuario");

		System.out.println("### Salvando usuário com rest");
		restUserService.save("Usuario");

		System.out.println("### Excluindo usuário com EJB");
		ejbUserService.delete(1);

		System.out.println("### Excluindo usuário com rest");
		restUserService.delete(1);

		System.out.println("\n------------------------------------------------------------\n");

		CarService ejbCarService = ejbAbstractFactory.getCarService();
		CarService restCarService = restAbstractService.getCarService();

		System.out.println("### Salvando carro com EJB");
		ejbCarService.save("Carro");

		System.out.println("### Salvando carro com rest");
		restCarService.save("Carro");

		System.out.println("### Atualizando carro com EJB");
		ejbCarService.update("Carro");

		System.out.println("### Atualizando carro com rest");
		restCarService.update("Carro");
	}
}
