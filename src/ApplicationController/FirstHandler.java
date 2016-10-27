/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationController;
import com.doing.more.java.appcontrol.*;
import java.util.HashMap;
/**
 *
 * @author Idel
 */
public class FirstHandler implements Handler{

    @Override
    public void handleIt(HashMap<String, Object> data) {
        System.out.println("HEY@@@ Handled it got called!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
    
}
