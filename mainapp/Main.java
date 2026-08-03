package mainapp;

import models.Student;
import models.Course;

public class Main {
    
    public static void main(String[] args){

        Student student = new Student("S001", "Kamal");

        Course course = new Course("IT101", "Programming");

        System.out.println(student);
        System.out.println(course);
    }
    
}
