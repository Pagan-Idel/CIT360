/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationController;

import com.doing.more.java.appcontrol.*;

/**
 *
 * @author Idel
 */
public class ACP {

    ApplicationController theController = new ApplicationController();

    public static void main(String[] args) {
        ACP acp = new ACP();
        acp.theController.mapCommand("First", new FirstHandler());
        acp.theController.mapCommand("Second", new SecondHandler());

        acp.theController.handleRequest("First", null);
        acp.theController.handleRequest("Second", null);
    }

}
