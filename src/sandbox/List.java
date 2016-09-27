/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Idel
 */
public class List {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println("using the add method to add variables to list");

        list.add("Idel");
        list.add("Nathan");
        list.add("Noble");

        //the order is preserved
        for (String i : list) {
            System.out.println(i);
        }
        System.out.println("this will return the element in the array where"
                + " you specify the index location:");

        System.out.println(list.get(0));

        System.out.println("\nThis will return the index of the first occurance of the element specified: ");

        //returns the first occurance of the element.
        System.out.println(list.indexOf("Nathan"));
        
        System.out.println("this will remove the element in the array where you specify the element. in this case, we removed noble: ");

        //this will remove the element in the array where 
        //you specify the element. in this case, we removed noble
        System.out.println(list.remove(2) + "\n");

        System.out.println("Printing array without Noble");
        for (String i : list) {
            System.out.println(i);
        }

        System.out.println("\nAdding back Noble");
        list.add(2, "Noble");

        for (String i : list) {
            System.out.println(i);
        }
        System.out.println("\n");

        System.out.println("\n");

        System.out.println("\nReplacing the last element of the arraylist with barney using set method:");

        //
        list.set(2, "Barney");

        for (String i : list) {
            System.out.println(i);
        }
    }
}
