
package javaapplication5;

import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonid
 */
public class StackCLASS {
    private int groundPrice;
    private int petroliumPrice;
    private  Random rand = new Random();

    
    
    
    /*public  void changeGroundPrice(int day, JLabel ground,JLabel pet)
    {
        if (day==1)
        {
        groundPrice = rand.nextInt(300) + 200;
        petroliumPrice = rand.nextInt(200)+100;
        ground.setText(String.valueOf(groundPrice));
        pet.setText(String.valueOf(petroliumPrice));
        
            
        }
    }*/
    
    
    public  void changeGroundPrice( JLabel ground,JLabel pet)
    {
        
        ground.setText(String.valueOf(groundPrice));
        pet.setText(String.valueOf(petroliumPrice));
        
            
        
    }
    
    
   /* public  void buyGround (Player player, int quantity) {
        
        if( player.getBalance() >= quantity*groundPrice  ) {
           player.changeBalanceNegative(quantity*groundPrice);
            player.IncrementGroundQuantity(quantity);           
        }
        else
            JOptionPane.showMessageDialog(null,"You don't have enough money for purchuasing");
            
    }*/
    
     public static void buyGround (Player player, int quantity, StackCLASS stack) {
        
        if( player.getBalance() >= quantity*stack.getGroundPrice()) {
           player.changeBalanceNegative(quantity*stack.getGroundPrice());
            player.IncrementGroundQuantity(quantity);           
        }
        else
            JOptionPane.showMessageDialog(null,"You don't have enough money for purchuasing");
            
    }
    public static void sellGround(Player player, int quantity,StackCLASS stack) {
        if (player.getGroundQuantity() >= quantity)
        {
            player.changeBalancePositive(quantity*stack.getGroundPrice());
            player.decrementGroundQuantity(quantity);
            
        }
        else
            JOptionPane.showMessageDialog(null,"You don't have enough quantity to sell");
    }
   
    public static void buyPetrolium(Player player, int quantity,StackCLASS stack) {
    
        if (player.getBalance() >= quantity*stack.getPetroliumPrice()) 
        {
            player.changeBalanceNegative(quantity*stack.getPetroliumPrice());
            player.IncrementPetroliumQuantity(quantity);
            
        }
        else
            JOptionPane.showMessageDialog(null,"You don't have enough money ");
        
    }
    public static void sellPetrolium (Player player, int quantity, StackCLASS stack) {
        if (player.getPetroliumQuantity()>= quantity) {
            player.changeBalancePositive(quantity*stack.getPetroliumPrice());
            player.decrementPetroliumQuantity(quantity);
        }
        else
            JOptionPane.showMessageDialog(null,"You don't have enough quantity to sell");
    }
    
    
    public  void setGroundPrice(int groundPrice) {
        this.groundPrice = groundPrice;
    }

    public  void setPetroliumPrice(int petroliumPrice) {
        this.petroliumPrice = petroliumPrice;
    }

    public int getGroundPrice() {
        return groundPrice;
    }

    public int getPetroliumPrice() {
        return petroliumPrice;
    }
    
}
