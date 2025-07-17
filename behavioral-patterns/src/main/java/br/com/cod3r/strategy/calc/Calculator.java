package br.com.cod3r.strategy.calc;

import br.com.cod3r.strategy.calc.strategies.OperationsStrategy;

public class Calculator {

	private final int num1;
	private final int num2;
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getResult(OperationsStrategy operation) {
		return operation.calculate(num1, num2);
	}
}
