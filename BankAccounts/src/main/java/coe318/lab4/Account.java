/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab4;

/**
 *
 * @author Eddy Perez Macias
 */
public class Account {

 private String nam;
 private int num;
 private double balance; 

public Account(String Name, int Number, double Amount){
nam = Name;
num = Number;
balance = Amount;   
}    



public String getName(){
return nam;
}

public double getBalance(){
return balance;
}

public int getNumber(){
return num;   
}

public boolean deposit(double amount){
if (amount <= 0 ){
    return false;
}
else balance = balance + amount;
    return true; 
}

public boolean withdraw(double amount){
if (amount > balance){    
    return false; 
}
else if (amount <= 0){
    return false;
}
else balance = balance - amount;
return true;
        } 


@Override
public String toString() {//DO NOT MODIFY
return "(" + getName() + ", " + getNumber() + ", " +
String.format("$%.2f", getBalance()) + ")";
}

}