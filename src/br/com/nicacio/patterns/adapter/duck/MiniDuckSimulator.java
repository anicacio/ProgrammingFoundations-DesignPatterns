package br.com.nicacio.patterns.adapter.duck;

import br.com.nicacio.patterns.adapter.duck.ducks.Duck;
import br.com.nicacio.patterns.adapter.duck.turkey.Turkey;
import br.com.nicacio.patterns.adapter.duck.turkey.TurkeyAdapter;
import br.com.nicacio.patterns.adapter.duck.turkey.WildTurkey;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.performQuack();
        duck.performFly();
    }
}
