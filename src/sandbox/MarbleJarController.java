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
public class MarbleJarController {
  
    MarbleJarView theView;
    MarbleJarModel theModel = new MarbleJarModel();
   
    public void addToJar(int marble){
       theModel.setMarbles(marble + theModel.getMarbles());  
    }
    
    public void takeAway(int marble){
        theModel.setMarbles((theModel.getMarbles()) - marble);
    }
    
    public void dumpJar(){
        theModel.setMarbles(0);
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
}
