/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Рустам
 */
public class StandardClass {
    
    private String name;
    private int price;

    public StandardClass() {
    }
    
 StandardClass(String a, int b)
 {
     this.name = a;
     this.price = b;
 }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public String getName(){return name;}
    public int getPrice(){return price;}
}

