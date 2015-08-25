/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasmus
 */
public class Threads {
    
    
    
    
    public static void main(String[] args) {
    
        
        
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);
                
        t1.start();
        t2.start();
        t3.start();
    }    
    
 
    }
    
    
   

