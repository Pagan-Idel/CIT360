/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.Random;

public class SlotMachine implements Runnable {

    public SlotMachine() {
    }

    public String calc() {
        Random num1 = new Random();
        String symbol;
        int num2 = num1.nextInt(5 - 0 + 1) + 0;
        switch (num2) {
            case 1:
                symbol = "@ ";
                break;
            case 2:
                symbol = "# ";
                break;
            case 3:
                symbol = "$ ";
                break;
            case 4:
                symbol = "% ";
                break;
            case 5:
                symbol = "& ";
                break;
            default:
                symbol = "Error";
        }
        return symbol;
    }

    public void run() {
        
        try{
//        String result = calc();
//        System.out.print(result);
//        if (result == result){
//            System.out.print("Winner!");
//        }else{
//            System.out.print("Sorry try again");
//        }
         System.out.println("Hello!");
        Thread.sleep(99999);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        Thread one = new Thread(new SlotMachine());
        Thread two = new Thread(new SlotMachine());
        Thread three = new Thread(new SlotMachine());

        one.start();
        two.start();
        three.start();
    }
}
