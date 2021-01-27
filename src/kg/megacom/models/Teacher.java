package kg.megacom.models;

public class Teacher extends Person{

    private double salary;

    public Teacher(String name, double salary) {
        super(name);
        setSalary(salary);
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
    }

    @Override
    public void work() {

        System.out.println("teach");
    }
}
