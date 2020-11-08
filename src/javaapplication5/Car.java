/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.io.Serializable;

/**
 *
 * @author Рустам
 */
public class Car  implements Serializable{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
     private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    
    

    


}
