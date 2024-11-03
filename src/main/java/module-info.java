module com.twentyfour.boulderdash {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.twentyfour.boulderdash to javafx.fxml;
    exports com.twentyfour.boulderdash;
}