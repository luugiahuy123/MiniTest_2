package minitest_2;

import Test.Test1.NhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();

        employee.add(new EmployeePartTime("C01" , "Huy" , 18 , "0213123123" , "huy@gmail" , 15));
        employee.add(new EmployeePartTime("C02" , "Nhat" , 18 , "0213123123" , "Nhat@gmail" , 18));
        employee.add(new EmployeePartTime("C03" , "Dat" , 18 , "0213123123" , "Dat@gmail" , 19));
        employee.add(new EmployeeFulltime("C03" , "Toan" , 18 , "0213123123" , "Toan@gmail" , 500000 , 0 , 4000000));
        employee.add(new EmployeeFulltime("C03" , "Bao" , 18 , "0213123123" , "Bao@gmail" , 400000 , 100000 , 4000000));
        employee.add(new EmployeeFulltime("C03" , "Nhon" , 18 , "0213123123" , "Nhon@gmail" , 300000 , 200000 , 4000000));


        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Tính lương trung bình nhân viên công ty");
            System.out.println("2. Tính lương trung bình nhân viên fulltime ");
            System.out.println("3. Tính lương trung bình nhân viên parttime ");
            System.out.println("4. Tính tổng lương phải trả cho nhân viên parttime");
            System.out.println("5. Đếm số người có mức lương cao hơn mức lương trung bình toàn công ty");
            System.out.println("6. Đếm số nhân viên partime có tên được nhập vào từ bàn phím");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            choice =scanner.nextInt();
            switch (choice){
                case 0:
                    System.out.println("thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon ko hop le.");
                case 1:
                    double sum = 0;
                    double avg = 0;
                    for (Employee nv : employee){
                        sum += nv.getSalary();
                    }
                    avg = sum/employee.size();
                    System.out.println("luong trung binh cua Tat ca nhan vien : " + avg);
                    break;
                case 2:
                    double sumFulltime = 0;
                    double avgFulltime = 0;
                    int count = 0;
                    for (Employee nv : employee){
                        if (nv instanceof EmployeeFulltime){
                            sumFulltime += nv.getSalary();
                            count++;
                        }
                    }
                    avgFulltime = sumFulltime/count;
                    System.out.println("Luong trung binh cua nhan vien fulltime la : " + avgFulltime);
                    break;
                case 3:
                    double sumPartTime = 0;
                    double avgPartTime = 0;
                    int count1 = 0;
                    for (Employee nv : employee){
                        if (nv instanceof EmployeePartTime){
                            sumPartTime += nv.getSalary();
                            count1++;
                        }
                    }
                    avgPartTime = sumPartTime/count1;
                    System.out.println("Luong trung binh cua nhan vien PartTime la : " + avgPartTime);
                    break;
                case 4:
                    double salaryPartTime =0 ;
                    for (Employee nv : employee){
                        if (nv instanceof EmployeePartTime){
                            salaryPartTime += nv.getSalary();
                        }
                    }
                    System.out.println("Tong luong Phai Tra cho nhan vien PartTime la : " + salaryPartTime);
                    break;
                case 5:
                    double sum1 = 0;
                    double avg1 = 0;
                    for (Employee nv : employee){
                        sum1 += nv.getSalary();
                    }
                    avg1 = sum1/employee.size();
                    int count2 = 0;
                    for (Employee nv : employee){
                        if (nv.getSalary() > avg1 ){
                            count2++;
                        }
                    }
                    System.out.println("So Luong Nha vien co luong cao hon muc trung binh la : " + count2);
                    break;
                case 6:
                    System.out.println("Ten nhan vien PartTime can tim");
                    Scanner scanner1 = new Scanner(System.in);
                    String namePartTime = scanner1.nextLine();
                    int count3 = 0;
                    for (Employee nv : employee){
                        if (nv instanceof EmployeePartTime && nv.getName().equals(namePartTime)){
                            count3++;
                        }
                    }
                    System.out.println("So nhan vien co ten PartTime duoc nhap tu ban phim la : " + count3);
                    break;

            }
        } while (choice != 0);
    }
}
