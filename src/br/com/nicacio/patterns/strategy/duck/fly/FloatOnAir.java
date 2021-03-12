package br.com.nicacio.patterns.strategy.duck.fly;

public class FloatOnAir implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Psy (Translation: I'm floating on air!!)");
    }
}
