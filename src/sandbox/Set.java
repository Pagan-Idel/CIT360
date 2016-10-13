/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Idel
 */
public class Set {

    public static void main(String[] args) {
        //  when insertion ordered doesnt matter and dupplicates are not allowed then we should use Sets.
        HashSet set = new HashSet();
        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add(null);
        set.add(1);
        set.add("Apple");
        set.add(10.10);
        System.out.println(set);
        //Happy Paths - using the contains method. This will return a true or false if
        //the element given to the method is actually in the set.
        System.out.println(set.contains("Apple"));
        System.out.println(set.contains("1"));
        //Happy Paths - isEmpty() checks to see if the set is empty from elements, 
        //the size() method returns a number of the amount of elements there are in the set
        //the remove method will remove the element given in its peramenter. 

        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.remove(1));
        System.out.println(set);
        System.out.println(set);

        //another way to print out the elemts in the set using iterator
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
        //clear() method erases all elements inside the set
        set.clear();
        System.out.println("\n--------intersection----------");

        //Intersection 
        HashSet int1 = new HashSet();
        int1.add("Noble");
        int1.add("Idel");
        int1.add("Nathan");

        HashSet int2 = new HashSet();
        int2.add("Carly");
        int2.add("Matt");
        int2.add("Nathan");

        HashSet intersection = new HashSet(int1); // use the copy constructor
        intersection.retainAll(int2); //addAll in the intersection

        System.out.print(intersection);
        System.out.println("\n-----------Union------------");
        //Union 
        HashSet int3 = new HashSet();
        int3.add("Noble");
        int3.add("Idel");
        int3.add("Nathan");

        HashSet int4 = new HashSet();
        int4.add("Carly");
        int4.add("Matt");
        int4.add("Nathan");
        HashSet union = new HashSet(int3); // use the copy constructor

        union.addAll(int4); //addAll in the UNION
        System.out.print(union);
        System.out.println("\n----------symetric difference-------------");
        HashSet int5 = new HashSet();
        int5.add("Noble");
        int5.add("Idel");
        int5.add("Nathan");

        HashSet int6 = new HashSet();
        int6.add("Carly");
        int6.add("Matt");
        int6.add("Nathan");
        HashSet symDiff = new HashSet(int5); // use the copy constructor

        symDiff.addAll(int6); //addAll in the UNION
        HashSet tmp = new HashSet(int5);
        tmp.retainAll(int6);
        symDiff.removeAll(tmp);
        System.out.print(symDiff);
        //Nasty paths
        System.out.println("\n-----------------------");
        try {
            //Nasty Path - adding a set to itself
            set.add(set);
        //Nasty Path - adding duplicate to the set, the add method returns false when 
            //a duplicate has been added.
            System.out.println(set.add(1));
            System.out.println(set.add(1));
            //Nasty Path - adding a null to the set, then adding a duplicate of null to it.
            System.out.println(set.add(null));
            System.out.println(set.add(null));
            //Nasty Path - removing an element that does not exist in the set.
            System.out.println(set.remove(2));
            //Nasty Path - looking for a null element in the set.
            System.out.println(set.contains(null));
            //Simply printing out the set. 
            System.out.println(set);
            //Creating a new set for nasty paths purposes. 
            HashSet set2 = new HashSet(5, 1); //capacity of set(5) with fill ratio of 100%; 
            //Nasty Paths - using the add method. 
            set2.add("Apple");
            set2.add("Mango");
            set2.add("Banana");
            set2.add(null); //inserting a null
            set2.add(1); //inserting an integer
            set2.add("Apple");
            set2.add(10.10); //inserting a double. 
            set2.add("\n"); //inserting a new line to the set. 
            System.out.println(set2);
        } catch (Exception e) {
            //handle the exception 
            e.printStackTrace(System.out);
        }

    }
}
