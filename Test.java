package minitest_2;

public class Test {
    public static void main(String[] args) {
        NhanVienPartTime[] partTimes = new NhanVienPartTime[3];
        NhanVienFulltime[] fulltimes = new NhanVienFulltime[3];

        partTimes[0] = new NhanVienPartTime("NV01", "Nguyen Van A", 30, "0123456789", "nva@gmail.com", 12);
        partTimes[1] = new NhanVienPartTime("NV02", "Nguyen Van B", 18, "0123454789", "nva1@gmail.com", 14);
        partTimes[2] = new NhanVienPartTime("NV03", "Nguyen Van C", 20, "0123452789", "nva2@gmail.com", 16);
        fulltimes[0] = new NhanVienFulltime("NV04", "Nguyen Van D", 18, "0123455645", "nva3@gmail.com", 0, 20000000, 100000);
        fulltimes[1] = new NhanVienFulltime("NV05", "Nguyen Van E", 18, "0123455645", "nva4@gmail.com", 400000, 20000000, 500000);
        fulltimes[2] = new NhanVienFulltime("NV06", "Nguyen Van F", 18, "0123455645", "nva5@gmail.com", 100000, 20000000, 400000);

        double tongLuong = 0.0;
        double trungBinhLuong;
        for (NhanVienFulltime tongLuong1 : fulltimes) tongLuong += tongLuong1.tinhLuong();
        for (NhanVienPartTime tongLuong2 : partTimes) tongLuong += tongLuong2.tinhLuong();
        trungBinhLuong = tongLuong / 6;
        System.out.println("trung binh luong nhan vien toan cong ty : " + trungBinhLuong);

        double tongLuongPartTime = 0.0;
        for (NhanVienPartTime tongLuong3 : partTimes) tongLuongPartTime += tongLuong3.tinhLuong();
        double trungBinhLuongPT = tongLuongPartTime / 3;
        System.out.println("Trung binh luong PartTime: " + trungBinhLuongPT);

        double tongLuongFullTime = 0.0;
        double trungBinhLuongFT ;
        for (NhanVienFulltime tongLuong4 : fulltimes) tongLuongFullTime += tongLuong4.tinhLuong();
        trungBinhLuongFT = tongLuongFullTime/3;
        System.out.println("Trung binh luong Full time: " + trungBinhLuongFT );


    }
}
