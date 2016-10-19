/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Idel
 */
public class MarbleJarView {

    private static int value;

    public void MarbleJarView() {

    }

    public static void main(String[] args) {
          int option = 0;
        Scanner input = new Scanner(System.in);

        MarbleJarView theView = new MarbleJarView();
        MarbleJarController theController = new MarbleJarController();

        while (option != 5) {
            System.out.print("What would you like to do with the jar?\n1) Add marble.\n2) Take away marble\n3) Dump marbles away\n4) How many marbles are in the jar?\n5) Exit\nEnter Number: ");
            option = input.nextInt();

            if (option == 1) {

                System.out.println("How many marbles would you like to add to the jar? ");
                theController.addToJar(input.nextInt());

            } else if (option == 2) {
                if (theController.theModel.getMarbles() == 0) {
                    System.out.println("You have 0 marbels in the jar, so there is nothing else to take away.");

                } else {
                    System.out.println("How many marbles would you like to remove from the jar? ");
                    theController.takeAway(input.nextInt());
                }
            } else if (option == 3) {
                theController.dumpJar();
                System.out.println("You have dropped the jar! The jar now has 0 marbles." );

            } else if (option == 4) {
                System.out.println("You have " + theController.theModel.getMarbles() + " marbles in the jar.");

            } else {
                break;
            }

        }
    }

    public static void listView() {
      
    }

    void displayList(ArrayList studentList) {
        System.out.print(studentList);
    }

}
