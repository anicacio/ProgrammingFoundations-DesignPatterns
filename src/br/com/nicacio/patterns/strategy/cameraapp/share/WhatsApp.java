package br.com.nicacio.patterns.strategy.cameraapp.share;

public class WhatsApp implements ShareStrategy{
    @Override
    public void share() {
        System.out.println("Sharing on WhatsApp");
    }
}
