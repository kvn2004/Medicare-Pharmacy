package lk.vtl.medicare.medicarepharmacy.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXToggleButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

public class NewOrderController {

    @FXML
    private JFXButton btnCancelOrder;

    @FXML
    private ImageView btnPlaceOrder;

    @FXML
    private JFXComboBox<?> cbSearchMedicine;

    @FXML
    private Label ibiPaymentOption;

    @FXML
    private Label ibiPaymentOption1;

    @FXML
    private ImageView imgPaymentOption;

    @FXML
    private Label lblBalance;

    @FXML
    private Label lblItemCount;

    @FXML
    private Label lblOrderDate;

    @FXML
    private Label lblSubTotal;

    @FXML
    private Label lblTotal;

    @FXML
    private JFXToggleButton tgCard;

    @FXML
    private TextField txtCash;

    @FXML
    private TextField txtCustomerName;

    @FXML
    private TextField txtDiscount;

    @FXML
    private TextField txtQty;

    @FXML
    void btnAddItemOnAction(ActionEvent event) {

    }

    @FXML
    void btnCancelOrderOnKeyPressed(KeyEvent event) {

    }

    @FXML
    void btnDeleteItemOnAction(ActionEvent event) {

    }

    @FXML
    void btnPlaceOrderOnKeyPressed(KeyEvent event) {

    }

    @FXML
    void tgCardOnAction(ActionEvent event) {

    }

}
