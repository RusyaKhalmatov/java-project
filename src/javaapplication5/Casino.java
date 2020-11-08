/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.awt.Color;
import java.util.Random;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Рустам
 */


public class Casino {

    
    /*private JTextField numberField;
    private JTextField betField;
    private JLabel randNumbL;
    private JLabel winsL  ;
    private JCheckBox first12;
    private JCheckBox second12;
    private JCheckBox third12;
    private JCheckBox oneEighteen;
    private JCheckBox even;
    private JCheckBox red;
    private JCheckBox black;
    private JCheckBox odd;
    private JCheckBox nineteen;
    */
    private final int numberBet = 35; // guessing one number
    private final int dozen = 2;//1st 12, 2nd 12
    private final int redBlackBet = 1;// red or black
    private final int smallBig = 1; // 1-18, 19-36
    private final int evenOdd = 1;
    private  int  winnings; 
    private int labWinnings;
    private int bet;
    Player player;
   /* Casino(Player pl, JTextField numb,JTextField bet,JLabel randN, JLabel wins, JCheckBox first,JCheckBox second,JCheckBox third,
            JCheckBox oneE, JCheckBox ev, JCheckBox red, JCheckBox black, JCheckBox odd, JCheckBox nineteen)
    {
        this.player = pl;
        numberField = numb;
        betField= bet;
        randNumbL = randN;
        winsL = wins;
        first12 = first;
        second12 = second;
        third12 = third;
        oneEighteen = oneE;
        this.even = ev;
        this.red = red;
        this.black=black;
        this.odd = odd;
        this.nineteen = nineteen;
        this.bet = Integer.parseInt(betField.getText());
    }*/

  /*  public Casino(JLabel randN, JCheckBox first, JLabel wins, JTextField betField) {
        this.bet = Integer.parseInt(betField.getText());
        //play(randN,first,wins);
    }
*/
   
    
    
    Random rand = new Random();
    
    public void setWinnings(double b)
    {
        winnings+=b;
    }
            
    
    
   public void play (Player pl,JTextField bet,JTextField numb,JLabel randN, JLabel wins, JCheckBox first,JCheckBox second,JCheckBox third,
            JCheckBox oneE, JCheckBox ev, JCheckBox red, JCheckBox black, JCheckBox odd, JCheckBox nineteen)
    {
        player = pl;
        this.winnings =0;
        
        if (player.getBalance()>Integer.parseInt(bet.getText()))
            {
            this.bet = Integer.parseInt(bet.getText());
            }
                else
                {
                    JOptionPane.showMessageDialog(null,"You don't have enouht money");
                    this.bet = 0;
                }
        int number = (int)(Math.random()*1+Math.random()*36);//rand.nextInt(1)+36;
        randN.setText(String.valueOf(number));
        
        
        if (number%2!=0)
        {
            randN.setForeground(Color.red);
        }
        else
            randN.setForeground(Color.black);
      
        
       if (Integer.parseInt(numb.getText())!=-1)
       {
           if(Integer.parseInt(numb.getText())>=1 && Integer.parseInt(numb.getText())<=36)
           { 
               if (Integer.parseInt(numb.getText())==number )// player plays with one number 
                 {
                   setWinnings(this.bet * numberBet);
                   
                 }
                else
                    player.changeBalanceNegative(Integer.parseInt(bet.getText()));
                  
           }
           else
               JOptionPane.showMessageDialog(null,"The number should be between 1 and 36");
       }
       
        if (first.isSelected())
        {
            if (number>=1 && number <=12)
            {
                
                setWinnings(dozen*this.bet);
              
            }
            else
             player.changeBalanceNegative(Integer.parseInt(bet.getText()));
                
        }
        
        if (second.isSelected())
        {
            if (number>=13 && number <=24)
            {
                setWinnings(dozen*this.bet);
               
            }
            else
                player.changeBalanceNegative(this.bet);
                
        }
        if (third.isSelected() )
        {
            if (number>=25 && number <=36)
            {    
                setWinnings(dozen*this.bet);
                
            }
           else
                player.changeBalanceNegative(this.bet);
               
        }
        if (oneE.isSelected())
        {
            if (number>=1 && number<=18)
            {
                setWinnings((smallBig*this.bet));
              
            }
            else
                player.changeBalanceNegative(this.bet);
              
        }
        
        
        if (nineteen.isSelected())
        {
            if (number>=19 && number<=36)
            {
                setWinnings((smallBig*this.bet));
                
            }
            else
                player.changeBalanceNegative(this.bet);
              
        }
        
        if (red.isSelected())
        {
            if ((number%2)!=0)
            {
              
                setWinnings((smallBig*this.bet));
                
            }
            else
                player.changeBalanceNegative(this.bet);
           
        }
        
         if (odd.isSelected())
        {
            if ((number%2)!=0)
            {
                setWinnings((smallBig*this.bet));   
            }
            else
                player.changeBalanceNegative(this.bet);
        }
        
         if (black.isSelected())
         {
             if ((number%2)==0)
            {
                setWinnings((smallBig*this.bet));
                
            }
            else
                player.changeBalanceNegative(this.bet);
               
         }
         
         if (ev.isSelected())
         {
             if ((number%2)==0)
            {
                setWinnings((smallBig*this.bet));  
            }
            else
                player.changeBalanceNegative(this.bet);
         
         }
         wins.setText(String.valueOf(winnings));
         player.changeBalancePositive(winnings);
                 
         
    }
    
    
}
