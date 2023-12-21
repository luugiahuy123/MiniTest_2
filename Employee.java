package minitest_2;

public class Employee {
    private String code;
    private String name;
    private int age;
    private String number;
    private String email;

    public Employee(String code, String name, int age, String number, String email) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.number = number;
        this.email = email;
    }

    public Employee() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public double getSalary(){
        return 0;
    }


    @Override
    public String toString() {
        return "NhanVien{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                ", email='" + email + '\'' +
                '}';
    }
}
