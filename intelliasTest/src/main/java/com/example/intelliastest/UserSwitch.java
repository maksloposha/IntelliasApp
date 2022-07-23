package com.example.intelliastest;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class UserSwitch extends Controller{


    @FXML
    private TextField firstUserInfo;

    @FXML
    private Button returnToMenuButton;

    @FXML
    private TextField secondUserInfo;

    @FXML
    private TextField thirdUserInfo;


    @FXML
    void initialize(){
        Users[] usersArray = getUsers();
        firstUserInfo.setText("Id: "+usersArray[0].getIdUser()+", "+usersArray[0].getFirstName()+" "+usersArray[0].getLastName()+
                        ", money amount: " + usersArray[0].getAmountMoney());
        secondUserInfo.setText("Id: "+usersArray[1].getIdUser()+", "+usersArray[1].getFirstName()+" "+usersArray[1].getLastName()+
                ", money amount: " + usersArray[1].getAmountMoney());
        thirdUserInfo.setText("Id " + usersArray[2].getIdUser() + ", "+ usersArray[2].getFirstName() + " " + usersArray[2].getLastName()+
                ", money amount: " + usersArray[2].getAmountMoney());
        firstUserInfo.setEditable(false);
        secondUserInfo.setEditable(false);
        thirdUserInfo.setEditable(false);
        returnToMenuButton.setOnAction(actionEvent -> {
            returnToMenuButton.getScene().getWindow().hide();
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(StartWindow.class.getResource("hello-view.fxml"));
            Scene scene = null;
            try {
                scene = new Scene(fxmlLoader.load(), 600, 400);
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.setTitle("Start menu");
            stage.setScene(scene);
            stage.show();
        });
    }
}

