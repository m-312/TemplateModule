module com.example.templatemodule2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.templatemodule2 to javafx.fxml;
    exports com.example.templatemodule2;
}