package kg.megacom.models;

public class Course {

    private String name;
    private Student[] students;
    private Teacher teacher;

    public Course(String name, int maxStudentCount, Teacher teacher) {
        this.name = name;
        this.students = new Student[maxStudentCount];
        this.teacher = teacher;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Student[] getStudents() {

        return students;
    }

    public boolean addStudent(Student student){



       /*
            1. Есть ли места?
            2. Проверить на уникальность
            3. Добавляем


        */

       return true;
    }

    public Teacher getTeacher() {

        return teacher;
    }

    public void setTeacher(Teacher teacher) {

        this.teacher = teacher;
    }



    /* @Override
   public String toString(){

        /*return "Course name - " + getName() +
                "\n"+
                "Teacher name - " + getTeacher().getName();*/


        /*
            Название курса: Java
            Преподатель: Долон
            Студенты:
                1. Жылдызбек
                2.
                3.
                4.
                5.
                6.
                7.
                8.

 }
         */

   public void info()
   {
       System.out.println("Course name - " + getName());
       System.out.println("Teacher name - " + getTeacher().getName());
       for(int i = 0; i < students.length; i++){
           System.out.println("Студенты: \n " + students[i].getName());
       }
   }

}
