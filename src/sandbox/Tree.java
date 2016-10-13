/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Idel
 */
public class Tree {

    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        TreeSet treeSet2 = new TreeSet();
        //Happy Path - using the add() method to add elements to the treeSet
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);
        //simply printing the treeSet
        System.out.println(treeSet);
        //Happy Path - ceiling() checks to see if the element given in the method's parameter exists. 
        //if it does not exist then it will take the next available element that is higher. 
        System.out.println(treeSet.ceiling(0));
        //Happy Path - contains() method checks to see if the element given exist in the treeSet.
        System.out.println(treeSet.contains(4));
        //Happy Path - descendingSet() prints out the set in reverse method. 
        System.out.println(treeSet.descendingSet());
        //Happy Path - using the clone() method to copy the elements from one set to the other. 
        treeSet2 = (TreeSet) treeSet.clone();
        System.out.println("Cloned Set: " + treeSet2);

        Iterator iterator;
        iterator = treeSet2.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        try {
            //adding end of line
            System.out.println("\n" + treeSet.comparator());
            //checkign if is empty
            System.out.println(treeSet.isEmpty());
            //removing out of scope
            System.out.println(treeSet.remove(6));
            //printing treeset
            System.out.println(treeSet);
            //checking the first location of an empty treeset
            System.out.println(treeSet.first());
            System.out.println(treeSet.last());
            System.out.println(treeSet.pollFirst());
            System.out.println(treeSet.pollLast());
            System.out.println(treeSet.higher(5));

            System.out.println(treeSet);
        } catch (Exception e) {
            System.out.println("This is broken!");

        }

        //nasty path
        System.out.println("----------------------------------------------------");
        try {
            treeSet.add(5.5);
            System.out.println(treeSet.ceiling(5.5));
            System.out.println(treeSet.ceiling(7));
            //adding null
            treeSet.add(null);
            //adding a string
            treeSet.add("NASTY");
            //what is higher than a null
            System.out.println(treeSet.higher(null));
            //what is higher than something that is not in the set
            System.out.println(treeSet.higher(6));
            //new treeset
            TreeSet treeSet3 = new TreeSet();
            //first of empty treeset
            System.out.println(treeSet3.pollFirst());
            //last of an empty treeset
            System.out.println(treeSet3.pollLast());
            //remove something thats not there
            System.out.println(treeSet3.remove(2));
            System.out.println(treeSet);

            treeSet.clear();
        } catch (Exception e) {
            //handle the exception 
            e.printStackTrace(System.out);
        }

    }

}
//try catches on these 
