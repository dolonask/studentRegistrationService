package kg.megacom.models;

public class Course {

    private int studentNumber = 0;
    private int maxStudentNumber;
    private String name;
    private Student[] students;
    private Teacher teacher;

    public Course(String name, int maxStudentCount, Teacher teacher) {
        this.name = name;
        this.students = new Student[maxStudentCount];
        this.teacher = teacher;
        this.maxStudentNumber = maxStudentCount;
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

        if(studentNumber > maxStudentNumber){
            return false;
        }
        for (int i = 0; i < studentNumber; i++)
        {
            if(students[i].getName().equals(student.getName()) & students[i].getAge() == student.getAge())
            {
                System.out.println("Student: " + student.getName() +"-"+ student.getAge()+" did not add! " +
                        "He is already on the course");
                return false;
            }
        }
        students[studentNumber] = student;
        studentNumber++;

        return true;
    }

    public Teacher getTeacher() {

        return teacher;
    }

    public void setTeacher(Teacher teacher) {

        this.teacher = teacher;
    }

    @Override
    public String toString(){
        String str;
        System.out.println("\n");
        str = "Course name - " + getName() +
                "\n"+
                "Teacher name - " + getTeacher().getName() + "\n" + "Students: "+ "\n";
        for(int i = 0; i < studentNumber; i++)
        {
            str += students[i].getName() + "\n";
        }
        return str;
    }
}
