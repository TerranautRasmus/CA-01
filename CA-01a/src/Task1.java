/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasmus
 */
public class Task1 implements Runnable {

    long sum =0;
    
    
    @Override
    public void run() {
        for (int i = 1; i < 1000000000; i++) {
            sum=sum+i;
            
        }
 
        System.out.println(""+sum);
    }
    
}
