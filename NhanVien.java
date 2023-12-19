package minitest_2;

public abstract class NhanVien {
    private String code;
    private String name;
    private int age;
    private String number;
    private String email;

    public NhanVien(String code, String name, int age, int number, String email){}

    public NhanVien(String code, String name, int age, String number, String email) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.number = number;
        this.email = email;
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
