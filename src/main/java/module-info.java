module org.example.javaessentials {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javaessentials to javafx.fxml;
    exports org.example.javaessentials;
}