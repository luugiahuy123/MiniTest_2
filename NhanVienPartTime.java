package minitest_2;

public class NhanVienPartTime extends NhanVien {
    private double soGioLamViec;

    public NhanVienPartTime(String code, String name, int age, int number, String email, double soGioLamViec) {
        super(code, name, age, number, email);
        this.soGioLamViec = soGioLamViec;
    }

    public NhanVienPartTime(String code, String name, int age, String number, String email, double soGioLamViec) {
        super(code, name, age, number, email);
        this.soGioLamViec = soGioLamViec;
    }

    public double getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(double soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    public double tinhLuong() {
        return this.getSoGioLamViec() * 100000;
    }


    @Override
    public String toString() {
        return "NhanVienPartTime{" +
                "soGioLamViec=" + soGioLamViec +
                '}';
    }
}
