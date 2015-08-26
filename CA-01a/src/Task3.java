
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rasmus
 */
public class Task3 implements Runnable {
public boolean active=true;

    
    
    
    @Override
    public void run() {

        int i=0;
        while(active){
            i++;
            System.out.println("Task3: "+i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Task2.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
