package br.com.nicacio.patterns.strategy.duck.ducks;

import br.com.nicacio.patterns.strategy.duck.fly.FlyNoWay;
import br.com.nicacio.patterns.strategy.duck.quack.NoQuack;

public class DecoyDuck extends Duck{
    public void Decoy() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new NoQuack());
    }

    @Override
    public void display() {

    }
}
