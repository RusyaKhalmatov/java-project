/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication5;

import java.util.HashSet;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author Leonid
 */
public class Bank {
    private int loanPercent ;
    private int savePercent;
    boolean status = false;
    
    
    
    public void setLoanPercentage (int loan) {
        
        this.loanPercent = loan;
    }
    public void setSavePercantage(int save)
    {
         this.savePercent = save;
    }
    public int getLoanPer(){return loanPercent;}
    public int getSavePer(){return savePercent;}

    public void changePercLabels(JLabel loan, JLabel save)
    {
        loan.setText(String.valueOf(loanPercent));
        save.setText(String.valueOf(savePercent));
    }
    public static void loanMoney(Player player, double amount, Bank bank) {
      
      player.changeBalancePositive(amount);
      player.setLoanedMoney((amount+(amount *((double)bank.getLoanPer()/100))));

    }
      
    public  void takeLoan (Player player,JLabel loan) {

            player.changeBalanceNegative(player.getLoanedMoney());
            player.setLoanedMoney(0);
            loan.setText(String.valueOf(player.getLoanedMoney()));
        
    }
    
    public static void saveMoney(Player player, double amount,Bank bank) {
       
       player.changeBalanceNegative(amount);
       player.setSavedMoney(amount+(amount*((double)bank.getSavePer()/100)));
      
    }
    
    public void takeSave (Player player,JLabel save) {
        
           /* double balance = player.getBalance();
            balance += player.getSavedMoney();
            player.setBalance(balance);
            player.setSavePeriod(0);*/
            player.changeBalancePositive(player.getSavedMoney());
            player.setSavedMoney(0);
            save.setText(String.valueOf(player.getSavedMoney()));
        
    }

    /*public static double getLoanPercent() {
        return loanPercent;
    }

    public static double getSavePercent() {
        return savePercent;
    }
    */
   
}
