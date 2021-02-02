package kg.megacom;


import kg.megacom.models.*;

public class Main {

    public static void main(String[] args) {


        Admin admin = new Admin("Zhyrgal", "Admin", "12345");
        Student student = new Student("Aibek", 55);
        Student student1 = new Student("Rahat", 55);
        Student student2 = new Student("Aibek", 55);
        Teacher teacher = new Teacher("Maksat", 20000);
        Course course = new Course("Java", 10, teacher);

        course.addStudent(student);
        course.addStudent(student1);
        course.addStudent(student2);

        course.info();

//        try {
//            Object admin = admin.clone();
//
//            System.out.println(admin);
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }

    }
}
