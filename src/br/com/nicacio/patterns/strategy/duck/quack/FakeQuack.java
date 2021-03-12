package br.com.nicacio.patterns.strategy.duck.quack;

public class FakeQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack Motherfucker!");
    }
}
