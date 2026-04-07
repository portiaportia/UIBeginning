package com.controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import com.sample.App;

public class HomeController {

    @FXML
    private void goToLogin() throws IOException {
        App.setRoot("login");
    }
}
