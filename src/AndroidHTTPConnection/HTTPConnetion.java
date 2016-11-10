/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AndroidHTTPConnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Idel
 */
public class HTTPConnetion {

    public static void main(String[] args) {
        try {
            URL pandora = new URL("http://www.pandora.com/");
            URLConnection open = pandora.openConnection();
            BufferedReader input = new BufferedReader(new InputStreamReader(open.getInputStream()));
            String html = input.readLine();
            while (html != null) {
                System.out.println(html);
                html = input.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //NASTY PATH -- url connection with a wrong website address.
        try {
            URL reddit = new URL("http://www.andoa.com/");
            URLConnection open = reddit.openConnection();
            BufferedReader input = new BufferedReader(new InputStreamReader(open.getInputStream()));
            String html = input.readLine();
            while (html != null) {
                System.out.println(html);
                html = input.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //NASTY PATH -- url connection with file not found in the website.
        try {
            URL reddit = new URL("http://www.pandora.com/404notfound");
            URLConnection open = reddit.openConnection();
            BufferedReader input = new BufferedReader(new InputStreamReader(open.getInputStream()));
            String html = input.readLine();
            while (html != null) {
                System.out.println(html);
                html = input.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //NASTY PATH -- url connection with an empty string
        try {
            URL reddit = new URL("");
            URLConnection open = reddit.openConnection();
            BufferedReader input = new BufferedReader(new InputStreamReader(open.getInputStream()));
            String html = input.readLine();
            while (html != null) {
                System.out.println(html);
                html = input.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //NASTY PATH -- url connection with a null 
        try {
            URL reddit = new URL(null);
            URLConnection open = reddit.openConnection();
            BufferedReader input = new BufferedReader(new InputStreamReader(open.getInputStream()));
            String html = input.readLine();
            while (html != null) {
                System.out.println(html);
                html = input.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
