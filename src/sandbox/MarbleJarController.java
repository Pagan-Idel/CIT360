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
public class MarbleJarController {
  
//    MarbleJarView theView;
   
    JarModel theModel = new JarModel();
    
    MarbleJarView theView = new MarbleJarView();
   
    public void addToJar(int marbleSize, String marbleName, String marbleColor){
       Marble theMarble = new Marble(marbleSize, marbleName, marbleColor);
       theModel.addMarble(theMarble);

//        theMarble.setMarbleColor(marbleColor);
//        theMarble.setMarbleName(marbleName);
//        theMarble.setMarbleSize(marbleSize);
    }
 
  

    void getAndDisplayJar() {
       
        ArrayList<Marble> thJar = theModel.getAllMarbles();
        theView.displayJar(thJar);
       
    }
   
  }
    
    
    
    
    
  
//    public void addToList() {
//        StudentNameListModel.setList();
//    }

//    private StudentNameListModel theModel;
//    private StudentNameListView theView;
//
//    public void showNames() {
//        ArrayList studentList;
//        studentList = theModel.getAllNames();
//        theView.displayList(studentList);
//    }

