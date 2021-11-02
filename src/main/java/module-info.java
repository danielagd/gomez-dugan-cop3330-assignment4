//module com.example.gomezdugancop3330assignment4 {
//    requires javafx.controls;
//    requires javafx.fxml;
//
//    requires org.controlsfx.controls;
//    requires com.dlsc.formsfx;
//
//    opens com.example.gomezdugancop3330assignment4 to javafx.fxml;
//    exports com.example.gomezdugancop3330assignment4;
//}

module ucf.assignments {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens ucf.assignments to javafx.fxml;
    exports ucf.assignments;
}