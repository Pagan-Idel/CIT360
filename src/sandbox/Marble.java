/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.io.Serializable;


/**
 *
 * @author Idel
 */
public class Marble implements Serializable{

    private int marbleSize;
    private String marbleName;
    private String marbleColor;
    

    public Marble(int aMarbleSize, String aMarbleName, String aMarbleColor) {
        
       this.marbleSize = aMarbleSize;
       this.marbleName = aMarbleName;
       this.marbleColor = aMarbleColor;
    }

    public int getMarbleSize() {
        return marbleSize;
    }


    public String getMarbleName() {
        return marbleName;
    }

    public String getMarbleColor() {
        return marbleColor;
    }

    public void setMarbleSize(int marbleSize) {
        this.marbleSize = marbleSize;
    }

    public void setMarbleName(String marbleName) {
        this.marbleName = marbleName;
    }

    public void setMarbleColor(String marbleColor) {
        this.marbleColor = marbleColor;
    }

    @Override
    public String toString() {
        return "Marble{" + "marbleSize=" + marbleSize + ", marbleName=" + marbleName + ", marbleColor=" + marbleColor + '}';
    }
    

}





















//    private ArrayList list = new ArrayList();
//    private String value;
//    private int index;
//    public StudentNameListModel(String value1, int index1){
//        
//        value = value1;
//        index = index1;
//    }
//    
//    public StudentNameListModel(String value1){
//        
//        value = value1;
//      
//    }
//    
//    public StudentNameListModel(int index1){
//        
//        index = index1;
//      
//    }
//    
//      public StudentNameListModel(){
//        
//      
//    }
//    
//    public boolean addToList(){
//        list.add(value);
//        return false;
//    }
//    public boolean deleteValue(){
//        list.remove(index);
//        return false;
//    }
//    public boolean clearList(){
//        list.clear();
//        return false;
//        
//    }
//    public ArrayList getAllNames(){
//        
//        return list;
//    }