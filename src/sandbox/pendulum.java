/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.Scanner;

/**
 *
 * @author Idel
 */
public class pendulum {
    
    public static void main(String[] args){
        String revered = "";
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a string: ");
        String input = in.nextLine();
        
        char array[] = input.toCharArray();
        
        for (int i = array.length - 1; i >= 0; i--){
             revered = revered + array[i];
        }
        
        if (revered.equals(input)){
            System.out.print("YES!");
            
        }else{
            System.out.print("No!");
        }
            
        
    }
    
}
