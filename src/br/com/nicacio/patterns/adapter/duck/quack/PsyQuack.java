package br.com.nicacio.patterns.adapter.duck.quack;

public class PsyQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Psy ai ai");
    }
}
