module org.example.javaessentials {
    // --- JavaFX ---
    requires javafx.controls;
    requires javafx.fxml;

    // --- Swing + FlatLaf ---
    requires java.desktop;          // necesario para Swing
    requires com.formdev.flatlaf;   // necesario para FlatLaf

    // --- Exportaciones ---
    opens org.example.javaessentials to javafx.fxml;
    exports org.example.javaessentials;
}