package kg.megacom.models;

public class Student extends Person {

    private int age;


    public Student(String name, int age) {
        super(name);
        setAge(age);
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age > 14 || age < 65)
            this.age = age;
    }

    @Override
    public void work() {

        System.out.println("study");
    }
}
