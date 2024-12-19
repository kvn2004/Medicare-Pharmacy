package lk.vtl.medicare.medicarepharmacy.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ItemPanelController {

    @FXML
    private TableView<?> TblItem;

    @FXML
    private JFXButton btnAddItem;

    @FXML
    private JFXButton btnDeleteItem;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private TableColumn<?, ?> cItemID;

    @FXML
    private TableColumn<?, ?> cItemName;

    @FXML
    private TableColumn<?, ?> cPurchasePrice;

    @FXML
    private TableColumn<?, ?> cQty;

    @FXML
    private TableColumn<?, ?> cSalePrice;

    @FXML
    private JFXComboBox<?> cbSearchItem;

    @FXML
    private TextField txtItemName;

    @FXML
    private TextField txtItemPurchasePrice;

    @FXML
    private TextField txtItemQty;

    @FXML
    private TextField txtItemQty1;

    @FXML
    private TextField txtItemSalePrice;

    @FXML
    void btnAddItemOnAction(ActionEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/View/AddItemPooUp.fxml"));
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        btnAddItem.getScene().getWindow().setOpacity(20);
    }

    @FXML
    void btnDeleteItemOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void cbSearchItem(ActionEvent event) {

    }

    @FXML
    void tblItemMouseClicked(MouseEvent event) {

    }

}
