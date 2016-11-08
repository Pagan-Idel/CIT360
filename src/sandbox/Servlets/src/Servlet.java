import org.quickconnectfamily.json.JSONOutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Idel on 11/3/2016.
 */
@WebServlet(name = "Servlet", urlPatterns = {"/idel"})
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //happy path
    try{

        String name = "{\"Student\":\"Idel Pagan\"}";
        String path = "C:\\Users\\Idel\\Desktop\\College\\Fifth\\Fall\\CIT 360\\students.txt";

        FileOutputStream fileOut = new FileOutputStream(path);

        JSONOutputStream jsonStream = new JSONOutputStream(fileOut);
        jsonStream.writeObject(name);
        jsonStream.close();


        JSONOutputStream outToClient = new JSONOutputStream(response.getOutputStream());
        outToClient.writeObject(name);



    }catch(Exception e){
            e.printStackTrace();
        }
//ngnasty path - json blank string

        try{

            String name = "";
            String path = "C:\\Users\\Idel\\Desktop\\College\\Fifth\\Fall\\CIT 360\\students.txt";

            FileOutputStream fileOut = new FileOutputStream(path);

            JSONOutputStream jsonStream = new JSONOutputStream(fileOut);
            jsonStream.writeObject(name);
            jsonStream.close();


            JSONOutputStream outToClient = new JSONOutputStream(response.getOutputStream());
            outToClient.writeObject(name);



        }catch(Exception e){
            e.printStackTrace();
        }
//json null string

        try{

            String name = null;
            String path = "C:\\Users\\Idel\\Desktop\\College\\Fifth\\Fall\\CIT 360\\students.txt";

            FileOutputStream fileOut = new FileOutputStream(path);

            JSONOutputStream jsonStream = new JSONOutputStream(fileOut);
            jsonStream.writeObject(name);
            jsonStream.close();


            JSONOutputStream outToClient = new JSONOutputStream(response.getOutputStream());
            outToClient.writeObject(name);

//fake bad connection - use http create function in acp that mimict a bad connection (exits wierdly)


        }catch(Exception e){
            e.printStackTrace();
        }




    }






    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request, response);
    }

}