package javaapplication5;

import java.io.File;
import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DateNew implements Serializable
{
	private int day;
	private int month;
	private int year;
	private static Random rand = new Random();
        private static Vector<RandomEvent> randomEvents = new Vector<>();
        private static Scanner scn;

   /* DateNew(JLabel dayLabTime, JLabel monthLabTime, JLabel yearLabTime, StackCLASS stack) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
        public int getDay(){return day;}
        public int getMonth(){return month;}
	DateNew(int d, int m, int y)
	{
		month = checkMonth(m);
		day = checkDay(d);
		year = checkYear(y);
		//printOne();
	}
        
      /*  public static int calculateAge(int day, String month, int year, DateNew birth)
        {
            int age=year- birth.getYear();
            if (month>birth.getMonth() && day>birth.getDay())
                age--;
            else 
                age++;
            
            return age;
        }*/
	DateNew (String m, int d, int y)
	{
		for (int i =0;i<13;i++)
		{
			if (m==months[i])
			{
				month = checkMonth(i);
			}
		}
		day = checkDay(d);
		year = checkYear(y);
		//printNameMDY();
	}
	

	
	private static final int[] dayInMonth={0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	private static final String[] months = {"/0","january","february","march","april","may","june",
											"july","august","september","october","november","december"};
	public int sum;
	
	public boolean IsLeap(int testYear)
	{
		if (( testYear % 400 == 0 || ( testYear % 4 == 0 && testYear % 100 != 0 ) ) )
			return true;
		else
			return false;
	}
	public int checkDay(int day) {
		if (day>0 && day<=dayInMonth[month])
			return day;
		if ( month == 2 && day == 29 && ( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0 ) ) )
				 return day;
		else 
			throw new IllegalArgumentException("day should be between 0 and 31");
	}
	
	public int checkMonth(int month) 
	{
		if (month>0 && month<=12)
			return month;
	
		else
			throw new IllegalArgumentException (" Month should be between 0 and 12");
		
	}
	
	public int getYear() {
		return year;
	}
	
	public int checkYear(int y)
	{
		if (y>0)
			return y;
		else 
			throw new IllegalArgumentException("year cannot be negative");
	}
	
	
        DateNew (Player player,StackCLASS stack,Bank bank,JLabel dayLab,JLabel monthLab, JLabel yearLab, JLabel ground, JLabel pet,JLabel loan,JLabel save,JLabel loanLab,JLabel saveLab,JLabel mainBal,JLabel secretBal) throws InterruptedException
        {
            clock(player,stack ,bank,dayLab,monthLab,yearLab,ground,pet,loan,save,loanLab,saveLab,mainBal,secretBal);
        }
        
        public void SetSalary(Player player, JLabel main, JLabel sec)
        {
            if (player.getJob()!=null)
            {
                player.changeBalancePositive(player.getJob().getSalary());
                main.setText(String.valueOf(player.getBalance()));
                sec.setText(String.valueOf(player.getBalance()));
            }
        }
        
        
	public  void clock(Player player,StackCLASS stack, Bank bank,
                JLabel dayLab,JLabel monthLab, JLabel yearLab, JLabel ground, JLabel pet,
                JLabel loan,JLabel save, JLabel loanLab,JLabel saveLab,JLabel mainBal,JLabel secretBal) throws InterruptedException 
	{   
            int a = 0;
            int count=0;
            int count2 =0;
            int r = 0;
		year = 2016;
		while (a==0)
		{
			
			for (int i = 1; i<= 12;i++)
			{
                            int loanInterest = rand.nextInt(2)+5;
                            int saveInterest = rand.nextInt(5)+10;
                            int petroliumPriceA = rand.nextInt(30)+30;
                            int groundPriceA = rand.nextInt(300) + 200;
                             
                              bank.setLoanPercentage(loanInterest);
                              bank.setSavePercantage(saveInterest);
                              bank.changePercLabels(loan, save);
                              
                              stack.setGroundPrice(groundPriceA);
                              stack.setPetroliumPrice(petroliumPriceA);
                              stack.changeGroundPrice(ground, pet);
                              SetSalary(player, mainBal, secretBal);//set salary every month
                             
				for (int j = 1; j<=dayInMonth[i];j++)
				{
					r = rand.nextInt(dayInMonth[i])+1;
                                        boolean isHaveHome = true;
					if(year%4==0)
					dayInMonth[2]=29;	
                                        
					monthLab.setText(months[i]);
					yearLab.setText(String.valueOf(year));
					dayLab.setText(String.valueOf(j));
					
                                    if (player.loanTaken())
                                    {
                                        
                                        if (count==31)
                                        {
                                            bank.takeLoan(player, loanLab);
                                            mainBal.setText(String.valueOf(player.getBalance()));
                                            secretBal.setText(String.valueOf(player.getBalance()));
                                            count=0;
                                        }
                                        count++;
                                    }
                                    
                                    if (player.moneySaved())
                                    {
                                       
                                       if(count2==31) {
                                           
                                           
                                            bank.takeSave(player,saveLab);
                                            mainBal.setText(String.valueOf(player.getBalance()));
                                            secretBal.setText(String.valueOf(player.getBalance()));
                                            count2=0;

                                        }
                                    count2++;
                                    }
                                    if(r==j) {
                                        int random;
                                        do{
                                            random = rand.nextInt(randomEvents.size());
                                        }while(random == 0);
                                        
                                        player.randomEventH(randomEvents.get(random));     //надо создать массив чтоб ошибок не выдавало
                                        if(random ==3) {
                                            player.getHouse().setName("");
                                            isHaveHome= false;
                                        }
                                        mainBal.setText(String.valueOf(player.getBalance()));
                                        secretBal.setText(String.valueOf(player.getBalance()));
                                        
                                        
                                        
                                        
                                    }
                                    
                                    if (!isHaveHome&&j<=dayInMonth[i]) {
                                        JOptionPane.showMessageDialog(null, "You have lost the Game ");
                                        return;
                                    }
                                     if(player.getDateOfbirth().getMonth()== i && player.getDateOfbirth().getDay() == j) {
                                         player.randomEventH(randomEvents.get(0));
                                         mainBal.setText(String.valueOf(player.getBalance()));
                                        secretBal.setText(String.valueOf(player.getBalance()));
                                    }
                                    
                                        Thread.sleep(1000);    
				}
				
                               
			}
			
			year++;
		}
	}
        
        public void dayLabel() throws InterruptedException
        {
            int a = 1;
        while(a==1)
        {
            for (int i = 0;i<=31;i++)
            {
                if (i<10)
                {
                    System.out.println("0"+i);
                    Thread.sleep(1000);
                }
                else
                {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
                }
            
        }    
        
        }
        public String getDate () {
            return day + ". " + month + ". " + year;
        }
        
        public static void readData () {
       //andomEvent randomEvent;
        for(int i = 0; i<6;i++){  // i = slok'ko eventov 

           int mood = scn.nextInt();
           int cost = scn.nextInt();
           String discription = scn.nextLine();
           //System.out.println(mood+" " + cost+discription);

          // randomEvent = new RandomEvent(discription, mood, cost);
           randomEvents.addElement(new RandomEvent(discription, mood, cost));
        }
        }
        
        public static void open() {
            try {
            scn = new Scanner(new File("Events.txt"));

            }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"File couldn't be finded");
            }
        }
        
        
        
        
        
        
        
}
