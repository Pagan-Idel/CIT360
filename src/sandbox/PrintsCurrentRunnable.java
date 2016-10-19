/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.Random;

/**
 *
 * @author Idel
 */
public class PrintsCurrentRunnable implements Runnable {

    int time;

    public PrintsCurrentRunnable() {

        Random r = new Random();

        time = r.nextInt(999);
    }

    @Override
    public void run() {
        try {
            //this will sleep the thread for a random time
            Thread.sleep(time);
            //Thread.sleep(-1000);
            System.out.println("=========================");
            //gets priority
            System.out.println(Thread.currentThread().getPriority());
            //is the thread interupted
            System.out.println(Thread.currentThread().isInterrupted());
            //checks to see if the thread is still working
            System.out.println(Thread.currentThread().isAlive());
            System.out.println("=========================");
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
