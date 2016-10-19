/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Idel
 */
public class ThreadRunner {

    public static void main(String args[]) {
        //creating the thread and assigning it to a variable
        Thread thread1 = new Thread(new PrintsCurrentRunnable());
        Thread thread2 = new Thread(new PrintsCurrentRunnable());
        Thread thread3 = new Thread(new PrintsCurrentRunnable());
        Thread executorThread = new Thread(new PrintsCurrentRunnable());

        //starting each thread
        thread1.start();
        thread2.start();
        thread3.start();
        //NASTY PATH - creating a different thread which does not pass anything in the parameter
        Thread thread4 = new Thread();
        //NASTY PATH - nothing happens on this one sense we did not pass it a run method (runnable)
        thread4.start();
        //NASTY PATH - starting a thread which already started.
        //thread1.start();

        //using an executer to start the threads
        ExecutorStarter ex1 = new ExecutorStarter();
        ex1.ExecuterStarter(new PrintsCurrentRunnable());
        //NASTY PATH - adding null to the executer starter
        //ex1.ExecuterStarter(null);
        //nasty path - passing a runnable which its run does nothing. Does it run? does it go?
        System.out.println("*********************");
        Thread thread5 = new Thread(new NastyPath(null));
        thread5.start();
        System.out.println("*********************");
        //alternative way to create an executer
        ExecutorService ex2 = Executors.newFixedThreadPool(3);
        ex2.submit(executorThread);
        ex2.submit(executorThread);
        ex2.submit(executorThread);
//        ex2.submit(null);

        //NASTY PATH - lock examples
        Object chain1 = new Object();
        Object chain2 = new Object();

        Thread lock1 = new Thread(new CrossLockExample(chain1, chain2));
        Thread lock2 = new Thread(new CrossLockExample2(chain1, chain2));

        try {
            Thread.sleep(3000);
//            lock1.start();
//            lock2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //NASTY PATH - race example
        String[] array1 = new String[10];
        Arrays.fill(array1, "");
        Thread race1 = new Thread(new RaceExample(array1));
        Thread race2 = new Thread(new RaceExample2(array1));
        try {
            Thread.sleep(3000);
            race1.start();
            race2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

//move nasty paths below
//excecutor passing null instead of runnable. (submit)
//pass null to the constructor of thread. 
