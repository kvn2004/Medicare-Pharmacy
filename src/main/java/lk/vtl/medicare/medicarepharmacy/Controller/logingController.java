package lk.vtl.medicare.medicarepharmacy.Controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class logingController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pwdtextfield.textProperty().bindBidirectional(txtPwd.textProperty());
        pwdtextfield.setManaged(false);
        pwdtextfield.setVisible(false);
    }

    @FXML
    private TextField pwdtextfield;
    @FXML
    private AnchorPane ancLog;

    @FXML
    private JFXButton btnLoging;

    @FXML
    private ImageView imgshowPwd;

    @FXML
    private PasswordField txtPwd;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnLogingOnAction(ActionEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/View/Dashboard.fxml"));
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Medicare Pharmacy");
        stage.setResizable(false);
        Stage window = (Stage) txtUsername.getScene().getWindow();
        window.close();
    }

    @FXML
    void imgshowPwdonMousePressed(MouseEvent event) {
            txtPwd.setVisible(false);
            txtPwd.setManaged(false);
            pwdtextfield.setVisible(true);
            pwdtextfield.setManaged(true);
            System.out.println(txtPwd.getText());
    }

    @FXML
    void imgshowPwdonMouseRelesed(MouseEvent event) {
        txtPwd.setVisible(true);
        txtPwd.setManaged(true);
        pwdtextfield.setVisible(false);
        pwdtextfield.setManaged(false);
        System.out.println(txtPwd.getText());
    }

}
