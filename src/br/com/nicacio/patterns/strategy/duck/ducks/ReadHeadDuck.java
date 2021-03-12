package br.com.nicacio.patterns.strategy.duck.ducks;

import br.com.nicacio.patterns.strategy.duck.fly.FlyWithWings;
import br.com.nicacio.patterns.strategy.duck.quack.Quack;

public class ReadHeadDuck extends Duck{

    public ReadHeadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real RedHeaded duck");
    }
}
