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
public class Job implements Serializable
{
   private String nameofJob;
   private int salary;
   
   Job(String a, int b)
   {
       setNameofJob(a);
       setSalary(b);
   }

    public String getNameofJob() {
        return nameofJob;
    }

    public void setNameofJob(String nameofJob) {
        this.nameofJob = nameofJob;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
   
 
   
           
    
    
}
