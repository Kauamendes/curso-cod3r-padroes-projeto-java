package br.com.cod3r.strategy.worker;

import br.com.cod3r.strategy.worker.strategies.eat.EatStrategy;
import br.com.cod3r.strategy.worker.strategies.transportation.TransportationStrategy;
import br.com.cod3r.strategy.worker.strategies.work.WorkStrategy;

public class Person {

    private EatStrategy eatStrategy;
    private TransportationStrategy moveStrategy;
    private WorkStrategy workStrategy;
    private String name;

    public Person(String name, EatStrategy eatStrategy, TransportationStrategy moveStrategy,
                  WorkStrategy workStrategy) {
        this.name = name;
        this.eatStrategy = eatStrategy;
        this.moveStrategy = moveStrategy;
        this.workStrategy = workStrategy;
    }

    public String getName() {
        return this.name;
    }

    public void eat() {
        eatStrategy.eat();
    }

    public void move() {
        moveStrategy.move();
    }

    public void work() {
        workStrategy.work();
    }
}
