package kg.megacom;

import java.util.Scanner;
import kg.megacom.models.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Creating admin:
        System.out.print("Enter admin name: ");
        String nameAdmin = scan.next();

        System.out.print("Enter login admin: ");
        String logAdmin = scan.next();

        System.out.print("Enter password admin: ");
        String passAdmin = scan.next();

        Admin admin = new Admin(nameAdmin, logAdmin, passAdmin);

        // Creating teacher:
        System.out.print("Enter teacher name: ");
        String nameTeacher = scan.next();

        System.out.print("Enter salary teacher: ");
        double salaryTeacher = scan.nextDouble();

        Teacher teacher = new Teacher(nameTeacher, salaryTeacher);

        // Creating course:
        System.out.print("Enter course name: ");
        String courseName = scan.next();

        System.out.print("Enter the Max number of students in the course: ");
        int maxStudent = scan.nextInt();

        Course course = new Course(courseName, maxStudent, teacher);

        // Создание судента:

        System.out.print("Enter student name: ");
        String studentName = scan.next();

        System.out.print("Enter student age: ");
        int studentAge = scan.nextInt();

        Student student = new Student(studentName, studentAge);
        course.addStudent(student);
        course.info();





























    }
}
