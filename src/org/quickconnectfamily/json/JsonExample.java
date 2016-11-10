/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.quickconnectfamily.json;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
//import sandbox.Marble;

/**
 *
 * @author Idel
 */
public class JsonExample {

    public static void main(String[] args) {
        try {
            String name = "{\"Student\":\"Idel Pagan\",\"Age\":\"22\"}";
            HashMap jsonList = (HashMap) JSONUtilities.parse(name);
            System.out.println(jsonList);

        } catch (Exception e) {
            e.printStackTrace();
        }
        //NASTY PATH - parsing a regular string
        try {
            String name = "Student: Idel Pagan";
            HashMap jsonList = (HashMap) JSONUtilities.parse(name);
            System.out.println(jsonList);

        } catch (Exception e) {
            e.printStackTrace();
        }
        //NASTY PATH - parsing an empty string

        try {
            String name = "";
            HashMap jsonList = (HashMap) JSONUtilities.parse(name);
            System.out.println(jsonList);

        } catch (Exception e) {
            e.printStackTrace();
        }

        //NASTY PATH -- parsing a null string
        try {
            String name = null;
            HashMap jsonList = (HashMap) JSONUtilities.parse(name);
            System.out.println(jsonList);

        } catch (Exception e) {
            e.printStackTrace();
        }

        //HAPPY Path - Reading from and to a file.
        try {
            String name = "{\"Student\":\"Idel Pag000000\"}";
            String path = "C:\\Users\\Idel\\Desktop\\College\\Fifth\\Fall\\CIT 360\\students.txt";
//            File studentFile = new File(path);

            
            FileOutputStream fileOut = new FileOutputStream(path);

            JSONOutputStream jsonStream = new JSONOutputStream(fileOut);
            jsonStream.writeObject(name);
            jsonStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String name = "{\"Student\":\"Idel Pagan\"}";
            String path = "C:\\Users\\Idel\\Desktop\\College\\Fifth\\Fall\\CIT 360\\readOnlyFile.txt";
//            File studentFile = new File(path);

            FileInputStream fileIn = new FileInputStream(path);
            FileOutputStream fileOut = new FileOutputStream(path);

            JSONOutputStream jsonStream = new JSONOutputStream(fileOut);
            jsonStream.writeObject(name);
            jsonStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        //NASTY PATH - pasing a null string through the jason object writer. 
        try {
            String name = "";
            String path = "C:\\Users\\Idel\\Desktop\\College\\Fifth\\Fall\\CIT 360\\students2.txt";
            File studentFile = new File(path);

            FileInputStream fileIn = new FileInputStream(path);
            FileOutputStream fileOut = new FileOutputStream(path);

            JSONOutputStream jsonStream = new JSONOutputStream(fileOut);
            jsonStream.writeObject(name);
            jsonStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        //nasty paths to add for reading a file: call read object with no read permission, read object for a image file (liek png). Call read multiple times to the same file (read twice).
        //nasty paths - writing to a file: no write permission to the directory's file. (file doesnt exist and no writing permission)
        //Happy Path - stringify an object
        try {

//            Marble theMarble = new Marble(1, "Idel", "Blue");
//            String marble = JSONUtilities.stringify(theMarble);
//            System.out.println(marble);

        } catch (Exception e) {
            e.printStackTrace();
        }
        //NASTY PATH - stringify a regular string instead of an object
        try {

            String theMarble = "Regular String";
            String marble = JSONUtilities.stringify(theMarble);
            System.out.println(marble);

        } catch (Exception e) {
            e.printStackTrace();
        }

        //NASTY PATH - Stringify an empty string
        try {

            String theMarble = "";
            String marble = JSONUtilities.stringify(theMarble);
            System.out.println(marble);

        } catch (Exception e) {
            e.printStackTrace();
        }

        //NASTY PATH - Stringify null string
        try {

            String theMarble = null;
            String marble = JSONUtilities.stringify(theMarble);
            System.out.println(marble);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
