package br.com.cod3r.strategy.calc.strategies;

public class MultiplicationOperation implements OperationsStrategy {

    @Override
    public Integer calculate(int num1, int num2) {
        return num1 * num2;
    }
}
