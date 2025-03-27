package br.com.cod3r.bridge.converter;

import br.com.cod3r.bridge.converter.converters.CSVConverter;
import br.com.cod3r.bridge.converter.converters.Converter;
import br.com.cod3r.bridge.converter.converters.JsonConverter;
import br.com.cod3r.bridge.converter.employees.Employee;
import br.com.cod3r.bridge.converter.employees.ITGuy;
import br.com.cod3r.bridge.converter.employees.ProjectManager;

public class Client {

	public static void main(String[] args) {
		Converter csvConverter = new CSVConverter();
		Converter jsonConverter = new JsonConverter();

		Employee itGuy = new ITGuy("Maurice Moss", 32,4000d);
		Employee projectManager = new ProjectManager("Jen Barber", 40, 6000d);

		System.out.println(csvConverter.getEmployeeFormated(itGuy));
		System.out.println(jsonConverter.getEmployeeFormated(itGuy));

		System.out.println(csvConverter.getEmployeeFormated(projectManager));
		System.out.println(jsonConverter.getEmployeeFormated(projectManager));
	}
}
