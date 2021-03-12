package br.com.nicacio.patterns.adapter.duck.ducks;

import br.com.nicacio.patterns.adapter.duck.fly.FlyBehavior;
import br.com.nicacio.patterns.adapter.duck.fly.FlyNoWay;
import br.com.nicacio.patterns.adapter.duck.quack.QuackBehavior;
import br.com.nicacio.patterns.adapter.duck.quack.Squeak;

public class RubberDuck extends Duck {

    // Empty constructor
    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    // Constructor receiving fly and quack behaviors
    public RubberDuck(FlyBehavior fb, QuackBehavior qb) {
        this.flyBehavior = fb;
        this.quackBehavior = qb;
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck!");
    }
}
