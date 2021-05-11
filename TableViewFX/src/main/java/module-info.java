module uni.edu.ni.programacion2.tableviewfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens uni.edu.ni.programacion2.tableviewfx to javafx.fxml;
    exports uni.edu.ni.programacion2.tableviewfx;
    exports uni.edu.ni.programacion2.tableviewfx.controller;
    exports uni.edu.ni.programacion2.tableviewfx.pojo;
}
