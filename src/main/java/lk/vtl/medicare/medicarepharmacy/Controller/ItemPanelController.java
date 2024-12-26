package lk.vtl.medicare.medicarepharmacy.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import lk.vtl.medicare.medicarepharmacy.DTO.ItemDTO;
import lk.vtl.medicare.medicarepharmacy.DTO.TM.ItemTM;
import lk.vtl.medicare.medicarepharmacy.Model.ItemModel;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ItemPanelController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cItemID.setCellValueFactory(new PropertyValueFactory<>("itemId"));
        cItemName.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        cPurchasePrice.setCellValueFactory(new PropertyValueFactory<>("getPrice"));
        cSalePrice.setCellValueFactory(new PropertyValueFactory<>("salePrice"));
        cQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        if (cDateTime != null) {
            cDateTime.setCellValueFactory(new PropertyValueFactory<>("dateTime"));
        } else {
            System.out.println("cDateTime is null");
        }

        try {
            loadTblItem();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void loadTblItem() throws SQLException, ClassNotFoundException {
        ArrayList<ItemTM> itemTMS = ItemModel.getAllMedicine();
        ObservableList<ItemTM> objects = FXCollections.observableArrayList();
        for (ItemTM item : itemTMS) {
            ItemTM itemTM = new ItemTM(
                    item.getItemId(),
                    item.getItemName(),
                    item.getGetPrice(),
                    item.getSalePrice(),
                    item.getQty(),
                    item.getDateTime()
            );
            objects.add(itemTM);
        }
        TblItem.setItems(objects);

    }

    @FXML
    private TableView<ItemTM> TblItem;

    @FXML
    private JFXButton btnAddItem;

    @FXML
    private JFXButton btnDeleteItem;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private TableColumn<ItemTM, String> cItemID;

    @FXML
    private TableColumn<ItemTM, String> cItemName;

    @FXML
    private TableColumn<ItemTM, String> cDateTime;

    @FXML
    private TableColumn<ItemTM, Float> cPurchasePrice;

    @FXML
    private TableColumn<ItemTM, Integer> cQty;

    @FXML
    private TableColumn<ItemTM, Float> cSalePrice;

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
        btnAddItem.getScene().getWindow();
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
