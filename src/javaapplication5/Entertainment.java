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
public class Entertainment extends StandardClass {
    private String nameOfEvent;
    private int price;
    private double moodCount;
    
    Entertainment(String a,int b, double count)
    {
        super (a,b);
        moodCount = count;
    }
    
    public double getMoodCount(){return moodCount;}
    
}
