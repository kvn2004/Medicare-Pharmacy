package lk.vtl.medicare.medicarepharmacy.Controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddItemPopUpController {

    @FXML
    private AnchorPane ancAddMedicine;

    @FXML
    private JFXButton btnAddItem;

    @FXML
    private Label lblItemId;

    @FXML
    private TextField txtItemName;

    @FXML
    private TextField txtItemqty;

    @FXML
    private TextField txtItemsalePrice;

    @FXML
    private TextField txtitemPurchasePrice;

    @FXML
    void btnAddItemOnAction(ActionEvent event) {

    }

}
