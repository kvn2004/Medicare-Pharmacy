package lk.vtl.medicare.medicarepharmacy.Controller;

import com.jfoenix.controls.JFXButton;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @FXML
    private Rectangle UpBar;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd | HH:mm:ss");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> updateTime()));
        timeline.setCycleCount(Timeline.INDEFINITE); // Run indefinitely
        timeline.play(); // Start the timeline
        lblInterfaceName.setText(btnDashboard.getText());
        imgInterfaceImage.setImage(imgDashboard.getImage());
    }

    private void updateTime() {
        lblDate.setText(LocalDateTime.now().format(formatter));
    }
    @FXML
    private AnchorPane ancinterfaces;

    @FXML
    private JFXButton btnDashboard;

    @FXML
    private JFXButton btnItem;

    @FXML
    private JFXButton btnNewOrder;

    @FXML
    private JFXButton btnReport;

    @FXML
    private ImageView imgItem;

    @FXML
    private ImageView imgDashboard;

    @FXML
    private ImageView imgInterfaceImage;

    @FXML
    private ImageView imgNewOrder;

    @FXML
    private ImageView imgReport;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblInterfaceName;

    @FXML
    private Label lblUserName;

    @FXML
    void btnDashboardOnAction(ActionEvent event) {
        lblInterfaceName.setText(btnDashboard.getText());
        imgInterfaceImage.setImage(imgDashboard.getImage());

    }

    @FXML
    void btnItemOnAction(ActionEvent event) throws IOException {
        lblInterfaceName.setText(btnItem.getText());
        imgInterfaceImage.setImage(imgItem.getImage());
        ancinterfaces.getChildren().clear();
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/View/ItemPanel.fxml"));
        ancinterfaces.getChildren().add(anchorPane);
    }

    @FXML
    void btnReportOnAction(ActionEvent event) {
        lblInterfaceName.setText(btnReport.getText());
        imgInterfaceImage.setImage(imgReport.getImage());
    }

    @FXML
    void btnbtnNewOrder(ActionEvent event) throws IOException {
        lblInterfaceName.setText(btnNewOrder.getText());
        imgInterfaceImage.setImage(imgNewOrder.getImage());
        ancinterfaces.getChildren().clear();
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/View/NewOrderPanel.fxml"));
        ancinterfaces.getChildren().add(anchorPane);
    }

}
