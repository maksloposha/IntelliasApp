package com.example.intelliastest;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ProductList extends Controller{

    @FXML
    private TextField firstProductInfo;

    @FXML
    private Button returnToMenuButton;

    @FXML
    private TextField secondProductInfo;

    @FXML
    private TextField thirdProductInfo;

    @FXML
    void initialize(){
        Product[] productsArray = getProducts();
        firstProductInfo.setText("Id: "+ productsArray[0].getIdProduct()+", "+productsArray[0].getNameProduct()+" "+
                ", price: " + productsArray[0].getPriceProduct());
        secondProductInfo.setText("Id: "+ productsArray[1].getIdProduct()+", "+productsArray[1].getNameProduct()+" "+
                ", price: " + productsArray[1].getPriceProduct());
        thirdProductInfo.setText("Id: "+ productsArray[2].getIdProduct()+", "+productsArray[2].getNameProduct()+" "+
                ", price: " + productsArray[2].getPriceProduct());
        firstProductInfo.setEditable(false);
        secondProductInfo.setEditable(false);
        thirdProductInfo.setEditable(false);


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