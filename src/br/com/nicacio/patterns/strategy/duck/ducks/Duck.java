package br.com.nicacio.patterns.strategy.duck.ducks;

import br.com.nicacio.patterns.strategy.duck.fly.FlyBehavior;
import br.com.nicacio.patterns.strategy.duck.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    // Empty constructor
    public Duck() {
    }

    // Methods
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) { quackBehavior = qb; }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
