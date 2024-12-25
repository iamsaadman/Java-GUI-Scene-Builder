module com.example.javafx_imageview {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafx_imageview to javafx.fxml;
    exports com.example.javafx_imageview;
}