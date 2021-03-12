package br.com.nicacio.patterns.strategy.duck.quack;

public class PsyQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Psy ai ai");
    }
}
