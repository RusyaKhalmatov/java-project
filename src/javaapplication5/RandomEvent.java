/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Vector;

/**
 *
 * @author Рустам
 */
public class RandomEvent {
    private String Discription;
    private int mood;
    private double cost;

    public RandomEvent() {
    }

    public RandomEvent(String Discription, int mood, double cost) {
        this.Discription = Discription;
        this.mood = mood;
        this.cost = cost;
    }
    

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String Discription) {
        this.Discription = Discription;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }
    
    
    
    
}





