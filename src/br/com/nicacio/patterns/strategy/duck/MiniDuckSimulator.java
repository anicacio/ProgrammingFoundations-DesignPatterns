package br.com.nicacio.patterns.strategy.duck;

import br.com.nicacio.patterns.strategy.duck.ducks.Duck;
import br.com.nicacio.patterns.strategy.duck.ducks.PsyDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck psyduck = new PsyDuck();
        psyduck.performFly();
        psyduck.performQuack();
        psyduck.swim();
        psyduck.display();
    }
}
