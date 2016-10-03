/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.HashMap;

/**
 *
 * @author Idel
 */
public class Map {

    public static void main(String[] args) {
        HashMap songs = new HashMap();
        String songName1 = "Dum Dee Dum";
        String songName2 = "Closer";
        String songName3 = "Dreamness";
        String songName4 = null;
        String songName5 = null;
        
        songs.put(0, songName1);
        songs.put(1, songName2);
        songs.put(2, songName3);
        System.out.println(songs);

        System.out.println(songs.size());

        System.out.println(songs.get(0));
        // TODO code application logic 
        System.out.println(songs.containsKey(1));
        System.out.println(songs.containsValue("Closer"));
        System.out.println(songs.isEmpty());
        System.out.println(songs.remove(0));
        songs.put(-1, "Hot Dog");
        System.out.println(songs);

        System.out.println(songs.get(-2));
//        songs.clear();
        System.out.println(songs);

        //Nasty Paths
        System.out.println(songs.get(10));
        System.out.println(songs.remove("Bob"));
        songs.put(3, songName4);
        songs.put(4, songName5);
        songs.put(null, "Bob");
//        songs.put(100/0, "Hello");
        System.out.println(songs);
        

    }

}
