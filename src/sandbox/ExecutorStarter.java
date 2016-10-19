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
public class ExecutorStarter {

   
    public void ExecuterStarter(Runnable run){
       //creating a new thread object a runnable perameter, then starting it
        //making it dynamic
        new Thread(run).start();
    }

}

//prebuild java class