module com.example.jocsjavafxmo3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jocsjavafxmo3 to javafx.fxml;
    exports com.example.jocsjavafxmo3;
}