/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.ArrayList;

/**
 *
 * @author Idel
 */
public class JarModel {
    private ArrayList<Marble> marbles = new ArrayList<>();
   
    
    public void addMarble(Marble aMarble){
        marbles.add(aMarble);
        
    }

    ArrayList<Marble> getAllMarbles() {
       return marbles;
    }
    
    
}
//get all marbles