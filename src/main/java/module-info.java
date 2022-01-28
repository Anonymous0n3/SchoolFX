module com.example.schoolfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.schoolfx to javafx.fxml;
    exports com.example.schoolfx;
    exports com.example.schoolfx.logic;
    opens com.example.schoolfx.logic to javafx.fxml;
    exports com.example.schoolfx.logic.enums;
    opens com.example.schoolfx.logic.enums to javafx.fxml;
    exports com.example.schoolfx.controllers;
    opens com.example.schoolfx.controllers to javafx.fxml;
}