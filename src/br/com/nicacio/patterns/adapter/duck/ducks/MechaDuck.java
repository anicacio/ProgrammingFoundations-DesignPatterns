package br.com.nicacio.patterns.adapter.duck.ducks;

import br.com.nicacio.patterns.adapter.duck.fly.FlyRocketPowered;
import br.com.nicacio.patterns.adapter.duck.quack.FakeQuack;

public class MechaDuck extends Duck {

    public MechaDuck() {
        setFlyBehavior(new FlyRocketPowered());
        setQuackBehavior(new FakeQuack());
    }

    @Override
    public void display() {
        System.out.println("I'm a shining Mecha duck!");
    }
}
