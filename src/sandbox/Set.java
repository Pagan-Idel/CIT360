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
    
    System.out.println(set.contains("Apple"));
    System.out.println(set.contains("1"));
     
    System.out.println(set.isEmpty());
    System.out.println(set.size());
    System.out.println(set.remove(1));
    System.out.println(set);
    System.out.println(set);
    
    //another way to print out set using iterator
    
    Iterator it = set.iterator();
    while (it.hasNext()){
        System.out.print(it.next());
    }
    
    set.clear();
    //Nasty paths
    set.add(set);
    System.out.println(set.add(1));  
    System.out.println(set.add(1));
    System.out.println(set.add(null));
    System.out.println(set.add(null));
    System.out.println(set.remove(2));
    System.out.println(set);

        HashSet set2 = new HashSet(5, 1); //capacity of set(5) with fill ratio of 100%; 
        set2.add("Apple");
        set2.add("Mango");
        set2.add("Banana");
        set2.add(null);
        set2.add(1);
        set2.add("Apple");
        set2.add(10.10);
        System.out.println(set2);
    }
}
