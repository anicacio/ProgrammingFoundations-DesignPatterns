package br.com.nicacio.patterns.adapter.duck.ducks;

import br.com.nicacio.patterns.adapter.duck.fly.FlyWithWings;
import br.com.nicacio.patterns.adapter.duck.quack.Quack;

public class MallardDuck extends Duck {

    // Constructor
    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
