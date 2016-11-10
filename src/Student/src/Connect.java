import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Idel on 11/2/2016.
 */
public class Connect {
    private List<Student> students;
    private Config theConfig;

   public Connect(){
        theConfig = new Config();
    }

    public static void main(String[] args){
        Connect theConnection = new Connect();
        theConnection.addStudent();
        theConnection.showAllStudents();
        theConnection.deleteStudent();
    }

    private void addStudent(){
        Session session = theConfig.getCurrentSession();

        //NASTY PATH -- null session
//        Session session = null;
        Transaction trans = session.beginTransaction();

        Student aStudent = new Student();
        aStudent.setFirstName("Idel");
        aStudent.setLastName("Pagan");
        aStudent.setAge(22);

        //NASTY PATH -- adding null to database and empty string
        //aStudent.setFirstName(null);
       // aStudent.setLastName("");
       // aStudent.setAge(null);

        session.save(aStudent);
        trans.commit();

        System.out.println("Student has been added, his ID is: " + aStudent.getStudentKey());

    }
    private void showAllStudents(){
        Session session = theConfig.getCurrentSession();

        Transaction trans = session.beginTransaction();

        Query hql = session.createQuery("select s from Student as s order by s");

        //NASTY PATH -- empty HQL

       // Query hql = session.createQuery("");

        //NASTY PATH -- null HQL

        // Query hql = session.createQuery(null);

        //NASTY PATH -- wrong column name HQL

        // Query hql = session.createQuery("select ColumnNotHere from Student as s order by s");

        students = hql.list();
        System.out.println("There are " + students.size() + " students in the database!");

        System.out.println(students);

        trans.commit();
    }
    private void deleteStudent(){
        Session session = theConfig.getCurrentSession();

        Transaction trans = session.beginTransaction();
        Scanner sc=new Scanner(System.in);
        System.out.println("So you would like to delete a student??? Whats his id? ");
        System.out.println("There are " + students.size() + " students in the database, try deleting " + (students.size() + 1) + "for a nasty path, aka deleting something that is not there: ");
        int id =sc.nextInt();

        Query hql = session.createQuery("delete from Student where studentKey =  :id");



        //NASTY PATH -- deleting from table a row that is not there
        //Query hql = session.createQuery("delete from Student where studentKey =  1000");

        //NASTY PATH -- deleting from table a null row
        //Query hql = session.createQuery("delete from Student where studentKey =  null");


        trans.commit();
        System.out.println(students);
    }


    //try sql instead of hql
}
