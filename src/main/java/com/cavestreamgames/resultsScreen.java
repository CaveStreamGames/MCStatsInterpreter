package com.cavestreamgames;

import java.io.IOException;
import javafx.fxml.FXML;

public class resultsScreen {

    @FXML
    private void switchToPrimary() throws IOException {
        window.setRoot("primary");
    }
}