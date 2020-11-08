/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Рустам
 */
public class MoodControl {
    
    public static void setMoodIcon(double moodCount, JLabel SmileIconLabel )
    {
       
        if (moodCount<0 && moodCount<=2)
        {  
             Icon smile = new ImageIcon(MoodControl.class.getResource("/javaapplication5/Images1/sadSmile.jpg"));
            SmileIconLabel.setIcon(smile);
        }
        if (moodCount>2 && moodCount<=4)
        {   
            Icon smile = new ImageIcon(MoodControl.class.getResource("/javaapplication5/Images1/badSmile.jpg"));
            SmileIconLabel.setIcon(smile);
        }  
        if (moodCount>4 && moodCount <=6)
        {
            Icon smile = new ImageIcon(MoodControl.class.getResource("/javaapplication5/Images1/neutralSmile.jpg"));
            SmileIconLabel.setIcon(smile);
        }  
        if (moodCount>6 && moodCount<=8)
        {
           Icon smile = new ImageIcon(MoodControl.class.getResource("/javaapplication5/Images1/happySmile.jpg"));
            SmileIconLabel.setIcon(smile); 
        }  
        if (moodCount>8)
        {
            Icon smile = new ImageIcon(MoodControl.class.getResource("/javaapplication5/Images1/veryHappySmile.jpg"));
            SmileIconLabel.setIcon(smile);
        }
  }
}           
    
    

