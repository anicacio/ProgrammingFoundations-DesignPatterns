package br.com.nicacio.patterns.strategy.duck.fly;

public class FlyNoWay implements br.com.nicacio.patterns.strategy.duck.fly.FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
