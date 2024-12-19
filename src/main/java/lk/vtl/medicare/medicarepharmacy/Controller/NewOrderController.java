package lk.vtl.medicare.medicarepharmacy.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXToggleButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class NewOrderController {

    @FXML
    private JFXButton btnDeleteItem;

    @FXML
    private JFXButton btnPlaceOrder;

    @FXML
    private JFXComboBox<?> cbSearchMedicine;

    @FXML
    private Label ibiPaymentOption;

    @FXML
    private Label ibiPaymentOption1;

    @FXML
    private ImageView imgPaymentOption;

    @FXML
    private JFXToggleButton tgCard;

    @FXML
    private TextField txtQty;

    @FXML
    private TextField txtQty1;

    @FXML
    private TextField txtQty11;

    @FXML
    private TextField txtQty2;

    @FXML
    void btnAddItemOnAction(ActionEvent event) {

    }

    @FXML
    void btnDeleteItemOnAction(ActionEvent event) {

    }

    @FXML
    void tgCardOnAction(ActionEvent event) {

    }

}
