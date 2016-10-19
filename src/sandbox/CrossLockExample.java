/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

/**
 *
 * @author Idel
 */
public class CrossLockExample extends Thread {

    Object chain1;
    Object chain2;

    public CrossLockExample(Object one, Object two) {
        chain1 = one;
        chain2 = two;
    }

    public void run() {
        //will only run if it can grab unique object
        synchronized (chain1) {
            System.out.println("/////////////////////////////////////");
            try {
                Thread.sleep(1000);
                System.out.println("using chain 1");
                System.out.println("I am about to grab chain two");
                //will only run if it can grab object
                synchronized (chain2) {
                    System.out.println("using both chains");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

class CrossLockExample2 extends Thread {

    Object chain1;
    Object chain2;

    public CrossLockExample2(Object one, Object two) {
        chain1 = one;
        chain2 = two;
    }

    public void run() {
        //will only run if it can grab unique object
        synchronized (chain2) {
            System.out.println("==============================");
            try {
                Thread.sleep(1000);
                System.out.println("using chain two");
                System.out.println("I am about to grab chain one");
                //will only run if it can grab object
                synchronized (chain1) {
                    System.out.println("Using both chains");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
