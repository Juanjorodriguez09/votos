module org.example.votos {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.votacio to javafx.fxml;
    exports com.votacio;
}
