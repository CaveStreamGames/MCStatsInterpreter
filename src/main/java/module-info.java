module com.cavestreamgames {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.cavestreamgames to javafx.fxml;
    exports com.cavestreamgames;

    requires json;
    requires java.net.http;
}
