package com.example.intelliastest;

public class Product {
    private String nameProduct;
    private String idProduct;
    private int priceProduct;
    public Product(String nameProduct,String idProduct
    , int priceProduct){
        this.nameProduct = nameProduct;
        this.idProduct = idProduct;
        this.priceProduct = priceProduct;
    }
    public String getNameProduct(){
        return this.nameProduct;
    }
    public String getIdProduct(){
        return idProduct;
    }
    public int getPriceProduct(){
        return priceProduct;
    }
}
