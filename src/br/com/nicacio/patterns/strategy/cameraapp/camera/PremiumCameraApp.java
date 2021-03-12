package br.com.nicacio.patterns.strategy.cameraapp.camera;

public class PremiumCameraApp extends PhoneCameraApp{
    @Override
    public void edit() {
        System.out.println("Premium mode ON!");
    }
}
