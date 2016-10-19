/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.Arrays;

/**
 *
 * @author Idel
 */
public class RaceExample implements Runnable {

    String[] array1;

    public RaceExample(String[] one) {
        array1 = one;
    }

    public void run() {
        try {
            Arrays.fill(array1, "Noble");
            System.out.println(Arrays.toString(array1));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class RaceExample2 implements Runnable {

    String[] array1;

    public RaceExample2(String[] one) {
        array1 = one;
    }

    public void run() {
        try {
            Arrays.fill(array1, "Idel");
            System.out.println(Arrays.toString(array1));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
