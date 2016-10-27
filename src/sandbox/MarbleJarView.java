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

    public void MarbleJarView() {

    }

    public static void main(String[] args) {
        int option = 0;
        Scanner input = new Scanner(System.in);

        MarbleJarView theView = new MarbleJarView();
        MarbleJarController theController = new MarbleJarController();

        while (option != 3) {
            System.out.print("Please describe your marble, show jar or quit program.\n1) Describe marble.\n2) Show Jar\n3) Quit\nEnter Number: ");
            option = input.nextInt();

            if (option == 1) {

                System.out.println("What is the size of the of the marble? ");
                int size = input.nextInt();
                input.nextLine();
                System.out.println("What is the color of the of the marble? ");
                String color = input.nextLine();

                System.out.println("What is the name of the of the marble? ");
                String name = input.nextLine();
                theController.addToJar(size, name, color);

            } else if (option == 2) {
                
                theController.getAndDisplayJar();

            } else if (option == 3) {
                break;
            }

        }

    }

    public void displayJar(ArrayList<Marble> theMarbles) {
        System.out.println("This is your jar: \n");
        for (int i = 0; i < theMarbles.size(); i++) {
            System.out.println(theMarbles.get(i));
        }
    }
}


