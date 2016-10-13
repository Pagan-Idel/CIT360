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
        ArrayList list = new ArrayList();

        System.out.println("using the add method to add variables to list");

        list.add("Idel");
        list.add("Nathan");
        list.add("Noble");

        //the order is preserved
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
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
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nAdding back Noble");
        list.add(2, "Noble");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("");

        System.out.println("");

        System.out.println("\nReplacing the last element of the arraylist with barney using set method:");

        //Happy Paths - just replaces the element to the specific location specify. 
        //In this case it is replacing element in index two with the new "barney" element. 
        list.set(2, "Barney");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //Happy Path - isEmpty() checking to see if the arrayList has elements inside of it. 
        //It will return a true or false. 
        System.out.println(list.isEmpty());

        list.add(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        try {
            System.out.println("Following are Nasty Paths:\n");
            //Nasty paths - adding an element outside of the capacity of the arraylist.
            list.set(3, "Joe");
            // Nasty Path - trying to get an element which does not exist in the arrayList
            System.out.println(list.get(4));
            //  Nasty Path - trying to remove an element which does not exist in the arrayList.
            System.out.println(list.remove(4));
            //  Nast Path - adding a new line to the arrayList. 
            System.out.println(list.add("\n"));
            // simply printing the arrylist. 
            System.out.println(list);
        } catch (Exception e) {
            //handle the exception 
            e.printStackTrace(System.out);
        }

    }
}
