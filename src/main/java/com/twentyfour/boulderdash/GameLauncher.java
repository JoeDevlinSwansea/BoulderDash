package com.twentyfour.boulderdash;

import javafx.fxml.FXML;
import javafx.scene.control.Label;



public class GameLauncher {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public static void main(String[] args) {
        GameApp.main(args);
    }
}