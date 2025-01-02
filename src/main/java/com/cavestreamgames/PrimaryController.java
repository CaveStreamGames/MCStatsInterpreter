package com.cavestreamgames;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import java.io.File;

public class PrimaryController {

    File file = new File("");

    @FXML
    private void switchToResults() throws IOException {
        window.setRoot("resultsScreen");
    }

    @FXML
    private void selectFile(){
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("JSON files (*.json)", "*.json");
        fileChooser.getExtensionFilters().add(extFilter);
        file = fileChooser.showOpenDialog(window.getScene().getWindow());
    }

    public File getFile(){
        return file;
    }

}
