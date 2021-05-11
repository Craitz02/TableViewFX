/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.edu.ni.programacion2.tableviewfx.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import uni.edu.ni.programacion2.tableviewfx.pojo.Producto;

/**
 * FXML Controller class
 *
 * @author Sistemas-11
 */
public class ProductoFXMLController implements Initializable {

    @FXML
    public TextField txtName;
    @FXML
    public TextField txtPrice;
    @FXML
    public Button btnBuscar;
    @FXML
    public Spinner<Integer> SpnCant;
    @FXML
    public TextField txtDesc;
    @FXML
    public Button btnAdd;
    @FXML
    public Button btnDelete;
    @FXML
    public TableView<Producto> tblViewProducto;
    @FXML
    public TableColumn<Producto, String> tblcID;
    @FXML
    public TableColumn<Producto, String> tblcName;
    @FXML
    public TableColumn<Producto, String> tblcDesc;
    @FXML
    public TableColumn<Producto, String> tblcCant;
    @FXML
    public TableColumn<Producto, String> tblcPrice;
    
    private ObservableList<Producto> productos;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        productos = FXCollections.observableArrayList();
        productos.add(new Producto(1,"coca cola","vitamina",6,13,""));
        tblcID.setCellValueFactory(new PropertyValueFactory<>("id"));
        tblcName.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tblcDesc.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
        tblcCant.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
        tblcPrice.setCellValueFactory(new PropertyValueFactory<>("precio"));
        SpnCant.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,1));
        
        tblViewProducto.setItems(productos);
    }    

    @FXML
    public void btnBuscarAction(ActionEvent event) {
        
    }

    @FXML
    public void btnAddAction(ActionEvent event) {
        String nombre = txtName.getText();
        String descripcion = txtDesc.getText();
        int cant = Integer.parseInt(SpnCant.getValue().toString());
        float precio = Float.parseFloat(txtPrice.getText());
        int id=0;
        Producto tmp = productos.get(productos.size()-1);
        if(tmp==null){
            id=1;
        }
        Producto p = new Producto(tmp.getId(), nombre, descripcion, cant, precio, "");
        productos.add(p);
    }

    @FXML
    public void btnDeleteAction(ActionEvent event) {
    }
    
}
