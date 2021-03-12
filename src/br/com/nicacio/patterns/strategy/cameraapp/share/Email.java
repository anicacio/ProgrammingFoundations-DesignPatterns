package br.com.nicacio.patterns.strategy.cameraapp.share;

public class Email implements ShareStrategy{
    @Override
    public void share() {
        System.out.println("Sending e-mail... OK!");
    }
}
