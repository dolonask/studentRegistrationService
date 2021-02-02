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

        for (int i = 0; i < students.length; i++) {
                if (students[i]!=null){
                    if (students[i].getName().equals(student.getName()) & students[i].getAge()==student.getAge()){

                    System.out.println("Its a same student!");
                    return false;

                    }
                }
            for (int k = 0; k < students.length; k++) {

                if (students[k]==null){

                    students[k] = student;
                    return true;
                }
            }
        }

        System.out.println("Course is full!");

        return false;

    }
    public void info() {
        for (int k = 0; k < students.length; k++) {

            System.out.println(students[k].getName());
        }
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString(){
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


         */
        return super.toString();
    }
}
