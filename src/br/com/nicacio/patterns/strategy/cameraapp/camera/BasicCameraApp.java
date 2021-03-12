package br.com.nicacio.patterns.strategy.cameraapp.camera;

public class BasicCameraApp extends PhoneCameraApp{
    @Override
    public void edit() {
        System.out.println("Basic mode ON!");
    }
}
