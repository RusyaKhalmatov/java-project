/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Рустам
 */
public class Player implements Serializable {
   // private static int count;
    private String Name;
    private String Surname;
    private String Gender;
    private double Mood; 
    private double Balance;
    private int groundQuantity;
    private int petroliumQuantity;
    private double loanedMoney;
    private double savedMoney;
    private int loanPeriod;
    
   
    public void setLoanedMoney(double money){loanedMoney = money;}
    public double getLoanedMoney(){return loanedMoney;}
    public boolean loanTaken()
    {
        return (loanedMoney!=0);
    }
    public boolean moneySaved(){return (savedMoney!=0);}
    private Car car;
    private House home;
    private Job job;
    private DateNew dateOfbirth;

    public DateNew getDateOfbirth() {
        return dateOfbirth;
    }
    private DateNew dateOfLoan;
    private DateNew saveDate;
   
   Player(DateNew d)
   {
       dateOfbirth = d;
       Balance = 5000;
       Mood = 10;
       groundQuantity = 0;
       petroliumQuantity = 0;
       loanedMoney = 0;
       savedMoney = 0;
       loanPeriod = 0;
       job = new Job("", 0);
       car = new Car("", 0);
       home = new House("", 0);
   }
   Player()
   {
       Balance = 5000;
       Mood = 10;
   }
   public void setBalance(double Balance) {
        this.Balance = Balance;
    }
   
   /*public void setSaveDate(DateNew d)
   {
       saveDate = d;
   }
   public void setDateOfLoan(DateNew d)
   {
       dateOfLoan = d;
   }
   */
   public int getGroundQuantity() {
        return groundQuantity;
    }

    public int getPetroliumQuantity() {
        return petroliumQuantity;
    }

    public void IncrementGroundQuantity(int groundQuantity) {
        this.groundQuantity += groundQuantity;
    }

    public void IncrementPetroliumQuantity(int quan)
    {
        this.petroliumQuantity+=quan;
    }
    public void decrementGroundQuantity(int quan)
    {
    
        this.groundQuantity-=quan;
    }
    public void decrementPetroliumQuantity(int quan)
    {
    this.petroliumQuantity-=quan;
    }
    public void setPetroliumQuantity(int petroliumQuantity) {
        this.petroliumQuantity = petroliumQuantity;
    }
    public void SetData(String name, String surname)
    {
        this.Name = name;
        this.Surname = surname;
       
      //  dateOfbirth = new Date(day,month,year);
        
    }
    

    public double getSavedMoney() {
        return savedMoney;
    }

    public void setSavedMoney(double savedMoney) {
        this.savedMoney = savedMoney;
    }


    public int getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(int loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    
    public double getBalance(){return Balance;}
    public void setGender(String a)
    {
        Gender = a;
    }
    //public static int getCount(){return count;}
    public double getMood(){return Mood;}
    public String getName(){return Name;}
    public String getSurname(){return Surname;}
    public String getGender(){return Gender;}
    public void setDate(int day,int month,int year)
    {
        dateOfbirth = new DateNew(day,month,year);
        
    }

    public void setMood(double Mood) {
        this.Mood += Mood;
    }
    public void setCar(Car a)
    {
        car = a;
    }
   
    public Car getCar(){return car;}
    
    public void changeBalancePositive(double amount)
    {
        
        this.Balance+=amount;
    }
    public void changeBalanceNegative(double amount)
    {
        if((Balance-amount) >= 0) {
            this.Balance-=amount;
        }
        else{
            JOptionPane.showMessageDialog(null, "You lose");
        }
    }
    public void setHouse(House a)
    {
        this.home = a;
    }
    public House getHouse(){return home;}
    
    public void setJob(Job j)
    {
        this.job = j;
    }
    
    public Job getJob(){return job;}
    
    public void incrementMood(double amount)
    {
        this.Mood+=amount;
    }
    public void decrementMood(double amount)
    {
        this.Mood-=amount;
    }
    
    public void randomEventH (RandomEvent randEv) {
        changeBalancePositive(randEv.getCost());
        setMood(randEv.getMood());
        JOptionPane.showMessageDialog(null,randEv.getDiscription()+randEv.getCost());
    }
    
    
    
   /* private Date dateOfBirth;
    private double balance;
    private String job;
    private Home home;
    private Car car;
    private int mood;
    private Stock stockAccount;*/
    
}
