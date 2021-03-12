package br.com.nicacio.patterns.strategy.duck.quack;

public class Squeak implements br.com.nicacio.patterns.strategy.duck.quack.QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
