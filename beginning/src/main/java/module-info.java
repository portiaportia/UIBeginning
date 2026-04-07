module com.sample {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.controllers to javafx.fxml;
    opens com.sample to javafx.fxml;
    exports com.sample;
}
