/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Рустам
 */
public class Container {
 
    //private int count;
    private static Vector <Player> players = new Vector<>();
    
    @SuppressWarnings("unchecked")

    public static void addPlayer(Player player ){
       // players = (Vector<Player>) deserData("Players");
       
        if(players.size()<=5)
                {
                    
                   // players[player.getCount()]=player;
                    
                    players.addElement(player); 
                    serData("Players", players);
                    Print();
                    System.out.println("Function addPlayer");
                    
                }
         else 
                {
                    JOptionPane.showMessageDialog(null, "Cannot create more than 5 players");

                }
       
    }
    public static void deser () {
        players = (Vector<Player>) deserData("Players");
    }
    public static void ser() {
         serData("Players", players);
    }

    public static Vector<Player> getPlayers() {
        return players;
    }

    public static void setPlayers(Vector<Player> players) {
        Container.players = players;
    }
    
    public static Player getPlayer(int i){
        return players.elementAt(i);
   
    }
    public static int size() {
        return players.size();
    }
    
    public static void Print()
    {
        for (int i =0; i< players.size();i++)
            System.out.println(players.elementAt(i).getName() + " Index - "+ i);
    }
    
    
    private static void serData(String fileName, Object object) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(object);
            fileOut.close();
            out.close();
        } catch (FileNotFoundException e) {

            System.out.println("fail ne nayden");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("oshibka vvoda vivoda");
            System.exit(2);
            e.printStackTrace();
        }
    }

    public static Object deserData(String fileName) {
        Object reObject = null;
        try {
            FileInputStream fileIn = new FileInputStream(fileName + ".ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            reObject = in.readObject();
            fileIn.close();
            in.close();
        } catch (FileNotFoundException e) {

            System.out.println("fail ne nayden");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("oshibka vvoda vivoda");  e.printStackTrace();
            System.exit(2);
          
        } catch (ClassNotFoundException e) {

            System.out.println("Class ne nayden");
            System.exit(3);
        }
        return reObject;
    }
    
    
    
    
}

