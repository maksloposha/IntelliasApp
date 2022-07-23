package com.example.intelliastest;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ChooseUser extends Controller {
    protected Users choosedUser;

    @FXML
    private TextField idRequestField;

    @FXML
    private Button nextShoppingButton;

    @FXML
    private Button returnButton;

    @FXML
    void initialize(){
        nextShoppingButton.setOnAction(actionEvent -> {
            Users[] users = getUsers();
            if (Objects.equals(idRequestField.getText(), users[0].getIdUser())){
                    choosedUser = users[0];
            }
            else if(Objects.equals(idRequestField.getText(), users[1].getIdUser())){
                choosedUser = users[1];
            }
            else if(Objects.equals(idRequestField.getText(), users[2].getIdUser())){
                choosedUser = users[2];
            }
            else {

                Alert alert = new Alert(Alert.AlertType.INFORMATION);

                alert.setTitle("Warning");
                alert.setHeaderText(null);
                alert.setContentText("Not existing id!!!");
                alert.showAndWait();
            }
            if(choosedUser != null){
                nextShoppingButton.getScene().getWindow().hide();
                openNewWindow("Shopping","Choosing product");
            }
        });
        returnButton.setOnAction(actionEvent -> {
            returnButton.getScene().getWindow().hide();
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(ChooseUser.class.getResource("/Shopping/FXML.fxml"));
            Scene scene = null;
            try {
                scene = new Scene(loader.load(), 600, 400);
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setTitle("Start menu");
            stage.setScene(scene);
            stage.show();
        });
    }
}
