package br.com.nicacio.patterns.strategy.cameraapp;

import br.com.nicacio.patterns.strategy.cameraapp.camera.BasicCameraApp;
import br.com.nicacio.patterns.strategy.cameraapp.camera.PhoneCameraApp;
import br.com.nicacio.patterns.strategy.cameraapp.share.Email;
import br.com.nicacio.patterns.strategy.cameraapp.share.WhatsApp;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {

        PhoneCameraApp cameraApp = new BasicCameraApp();
        String share = getSharing();

        switch (share) {
            case ("e") -> cameraApp.setShareStrategy(new Email());
            case ("w") -> cameraApp.setShareStrategy(new WhatsApp());
            default -> cameraApp.setShareStrategy(() -> System.out.println("Share Canceled"));
        }

        cameraApp.take();
        cameraApp.edit();
        cameraApp.save();
        cameraApp.share();
    }

    public static String getSharing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Share with: \nEmail (e)\nWhatsApp (w)");
        String appName = scanner.next();
        return appName;
    }
}
