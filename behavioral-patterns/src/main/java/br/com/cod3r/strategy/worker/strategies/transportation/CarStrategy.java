package br.com.cod3r.strategy.worker.strategies.transportation;

public class CarStrategy implements TransportationStrategy {

    @Override
    public void move() {
        System.out.println("I use a car to go anywhere");
    }
}
