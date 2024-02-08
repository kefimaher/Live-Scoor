module com.example.foot {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.foot to javafx.fxml;
    exports com.example.foot;
}