module lk.vtl.medicare.medicarepharmacy {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;
    requires java.sql;
    requires static lombok;


    opens lk.vtl.medicare.medicarepharmacy.Controller to javafx.fxml;
    exports lk.vtl.medicare.medicarepharmacy;
}