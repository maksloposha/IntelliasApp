package com.example.intelliastest;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    public Users[] getUsers(){
        Users[] users = new Users[3];
        users[0] = new Users("Emd4l","Elon","Mask", 5433);
        users[1] = new Users("Mzj4P","Mark", "Zuckerberg",4357);
        users[2] = new Users("Sj0jnk","Steve","Jobs",5432);
        return users;
    }
    public Product[] getProducts(){
        Product[] products = new Product[3];
        products[0] = new Product("Iphone","Ix10k",1000);
        products[1] = new Product("Air pods", "Ap34C",199);
        products[2] = new Product("Mac book", "Mb22N",1400);
        return products;
    }
    @FXML
    private Button productListButton;

    @FXML
    private Button shoppingButton;

    @FXML
    private Button userListButton;

    protected void openNewWindow(String name, String title){
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(StartWindow.class.getResource(name));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 600, 400);
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void initialize(){
        userListButton.setOnAction(actionEvent -> {
            openNewWindow("UserSwitch.fxml","User list");
            userListButton.getScene().getWindow().hide();
        });

        productListButton.setOnAction(actionEvent -> {
            userListButton.getScene().getWindow().hide();
            openNewWindow("ProductList.fxml","Product list");
        });

        shoppingButton.setOnAction(actionEvent -> {
            userListButton.getScene().getWindow().hide();
            openNewWindow("ChooseUser.fxml","Shopping");
        });
    }
}
