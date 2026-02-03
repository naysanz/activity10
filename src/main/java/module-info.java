module com.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens demo.myProject to javafx.fxml;
    exports demo.myProject;
}
