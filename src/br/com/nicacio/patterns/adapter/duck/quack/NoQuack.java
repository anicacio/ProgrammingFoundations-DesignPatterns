package br.com.nicacio.patterns.adapter.duck.quack;

public class NoQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
