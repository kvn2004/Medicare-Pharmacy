package lk.vtl.medicare.medicarepharmacy.Controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import lk.vtl.medicare.medicarepharmacy.DTO.ItemDTO;
import lk.vtl.medicare.medicarepharmacy.Model.ItemModel;

import java.sql.SQLException;

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
    void btnAddItemOnAction(ActionEvent event) throws SQLException, ClassNotFoundException {
         String itemId;
         String itemName;
         float getPrice;
         float salePrice;
         int qty;

         itemId = lblItemId.getText();
         itemName = txtItemName.getText();
         getPrice = Float.parseFloat(txtitemPurchasePrice.getText());
         salePrice = Float.parseFloat(txtItemsalePrice.getText());
         qty = Integer.parseInt(txtItemqty.getText());


        ItemDTO itemDTO  = new ItemDTO(itemId, itemName, getPrice, salePrice, qty);
        System.out.println("in the Conntroller"+itemDTO);
        boolean isSaved = ItemModel.saveMedicine(itemDTO);
        if (isSaved) {
            new Alert(Alert.AlertType.INFORMATION, "Saved...!").show();
        } else {
            new Alert(Alert.AlertType.ERROR, "Something Went Wrong...!").show();
        }

    }

}
