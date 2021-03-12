package br.com.nicacio.patterns.strategy.duck.ducks;

import br.com.nicacio.patterns.strategy.duck.fly.FlyRocketPowered;
import br.com.nicacio.patterns.strategy.duck.quack.FakeQuack;

public class MechaDuck extends Duck{

    public MechaDuck() {
        setFlyBehavior(new FlyRocketPowered());
        setQuackBehavior(new FakeQuack());
    }

    @Override
    public void display() {
        System.out.println("I'm a shining Mecha duck!");
    }
}
