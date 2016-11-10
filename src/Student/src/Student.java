import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

import javax.persistence.Table;
@Entity
@Table(name = "student")


public class Student {
@Id
@GeneratedValue
    private int StudentKey;
    private String firstName;
    private String lastName;
    private int age;

    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }

    public int getStudentKey() {
        return StudentKey;
    }

    public void setStudentKey(int studentKey) {
        StudentKey = studentKey;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentKey=" + StudentKey +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
