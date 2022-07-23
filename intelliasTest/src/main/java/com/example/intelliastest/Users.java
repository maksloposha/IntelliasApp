package com.example.intelliastest;

public class Users {
    protected String IdUser;
    protected String firstName;
    protected String lastName;
    protected int amountMoney;
    public Users(String IdUser,String firstName,String lastName,int amountMoney){
        this.IdUser = IdUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.amountMoney = amountMoney;
    }
    public String getIdUser(){
        return IdUser;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAmountMoney(){
        return amountMoney;
    }
    public void setAmountMoney(int amountMoney){
        this.amountMoney = amountMoney;
    }
}
