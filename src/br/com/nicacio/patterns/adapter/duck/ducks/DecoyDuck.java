package br.com.nicacio.patterns.adapter.duck.ducks;

import br.com.nicacio.patterns.adapter.duck.fly.FlyNoWay;
import br.com.nicacio.patterns.adapter.duck.quack.NoQuack;

public class DecoyDuck extends Duck {
    public void Decoy() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new NoQuack());
    }

    @Override
    public void display() {

    }
}
