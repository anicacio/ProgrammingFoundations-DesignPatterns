package br.com.nicacio.patterns.adapter.duck.ducks;

import br.com.nicacio.patterns.adapter.duck.fly.FlyWithWings;
import br.com.nicacio.patterns.adapter.duck.quack.Quack;

public class ReadHeadDuck extends Duck {

    public ReadHeadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real RedHeaded duck");
    }
}
