package br.com.cod3r.strategy.calc;

import br.com.cod3r.strategy.calc.strategies.AddictionalOperation;
import br.com.cod3r.strategy.calc.strategies.DivisionOperation;
import br.com.cod3r.strategy.calc.strategies.MultiplicationOperation;
import br.com.cod3r.strategy.calc.strategies.SubtractionOperation;

public class Client {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult(new AddictionalOperation()));
		System.out.println(calc.getResult(new SubtractionOperation()));
		System.out.println(calc.getResult(new MultiplicationOperation()));
		System.out.println(calc.getResult(new DivisionOperation()));

		System.out.println(calc.getResult((n1, n2) -> (int) Math.pow(n1, n2)));
	}
}
