package br.com.nicacio.patterns.strategy.duck.ducks;

import br.com.nicacio.patterns.strategy.duck.fly.FloatOnAir;
import br.com.nicacio.patterns.strategy.duck.quack.PsyQuack;

public class PsyDuck extends Duck{

    public PsyDuck() {
        setFlyBehavior(new FloatOnAir());
        setQuackBehavior(new PsyQuack());
    }

    public void display() {
        System.out.println("I'm a pokemon!");
    }
}
