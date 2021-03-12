package br.com.nicacio.patterns.adapter.duck.turkey;

import br.com.nicacio.patterns.adapter.duck.ducks.Duck;

public class TurkeyAdapter extends Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void performQuack() {
        turkey.gobble();
    }

    public void performFly() {
        for(int i=0; i < 5; i++) {
            turkey.fly();
        }
    }

    @Override
    public void display() {

    }
}
