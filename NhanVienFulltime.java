package minitest_2;

public class NhanVienFulltime extends NhanVien {
    private int soTienPhat;
    private int soLuongCung;
    private  int soTienThuong;

    public NhanVienFulltime(String code, String name, int age, int number, String email, int soTienPhat, int soLuongCung, int soTienThuong) {
        super(code, name, age, number, email);
        this.soTienPhat = soTienPhat;
        this.soLuongCung = soLuongCung;
        this.soTienThuong = soTienThuong;
    }

    public NhanVienFulltime(String code, String name, int age, String number, String email, int soTienPhat, int soLuongCung, int soTienThuong) {
        super(code, name, age, number, email);
        this.soTienPhat = soTienPhat;
        this.soLuongCung = soLuongCung;
        this.soTienThuong = soTienThuong;
    }

    public int getSoTienPhat() {
        return soTienPhat;
    }

    public void setSoTienPhat(int soTienPhat) {
        this.soTienPhat = soTienPhat;
    }

    public int getSoLuongCung() {
        return soLuongCung;
    }

    public void setSoLuongCung(int soLuongCung) {
        this.soLuongCung = soLuongCung;
    }

    public int getSoTienThuong() {
        return soTienThuong;
    }

    public void setSoTienThuong(int soTienThuong) {
        this.soTienThuong = soTienThuong;
    }


    public double tinhLuong() {
        return this.soLuongCung + (this.soTienThuong - this.soTienPhat);
    }


    @Override
    public String toString() {
        return "NhanVienFulltime{" +
                "soTienPhat=" + soTienPhat +
                ", soLuongCung=" + soLuongCung +
                ", soTienThuong=" + soTienThuong +
                '}';
    }
}
