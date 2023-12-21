package minitest_2;

public class EmployeePartTime extends Employee {
    private double time;

    public EmployeePartTime(String code, String name, int age, String number, String email, double time) {
        super(code, name, age, number, email);
        this.time = time;
    }

    public EmployeePartTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public double getSalary() {
        return time*100000;
    }
}
