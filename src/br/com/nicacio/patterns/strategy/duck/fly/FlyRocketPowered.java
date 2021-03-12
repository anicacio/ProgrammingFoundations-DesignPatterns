package br.com.nicacio.patterns.strategy.duck.fly;

public class FlyRocketPowered implements br.com.nicacio.patterns.strategy.duck.fly.FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
