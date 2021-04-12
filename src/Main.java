import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner  = new Scanner(System.in);

    public static void main(String[] args) {
        ManagerNhanVien managernhanvien = new ManagerNhanVien();
        Scanner sc = new Scanner(System.in);
        List<NhanVien> list = new ArrayList<>();
        List<NhanVienFulltime> list1 = new ArrayList<>();
        while (true) {
//            int index = 0;
            int choice;
            System.out.println("Students Manager");
            System.out.println("1- Add Student ");
            System.out.println("2- Display Student ");
            System.out.println("3- ListTrungBinh ");
            System.out.println("4- SalaryPartTime ");
            System.out.println("0- Exit ");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    showMenu();
                    break;
                case 2:
                    managernhanvien.displayNhanVien();
                    break;
                case 3:
                    managernhanvien.lstTrungBinh();
                    break;
                case 4:
                   managernhanvien.salaryPartTime();
                   break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
//        NhanVien a = new NhanVienFulltime("a","1",1,1,"a",1,0,12000000);
//        NhanVien a2 = new NhanVienFulltime("b","2",2,2,"b",2,0,1300000);
//
//        NhanVien b = new NhanVienParttime("c","3",3,3,"c",1);
//        NhanVien b2 = new NhanVienParttime("d","4",4,4,"d",2);
//        managernhanvien.addNhanVien(a);
//        managernhanvien.addNhanVien(a2);
//        managernhanvien.addNhanVien(b);
//        managernhanvien.addNhanVien(b2);
//
//
//        // show nhan vien
//        managernhanvien.displayNhanVien();
//        System.out.println("More than less listTb");
//        managernhanvien.lstTrungBinh();
//        System.out.println("Total Salary PartTime " + managernhanvien.salaryPartTime());


    }

    public static void showMenu() {
        ManagerNhanVien managernhanvien = new ManagerNhanVien();
        boolean menu = true;
        while (menu) {
            System.out.println("Mời kiểu  nhân viên \n 1.FullTimeEmployee 2.PartTimeEmployee 3.Exit");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    managernhanvien.addFullTime();
                    break;
                case 2:
                    managernhanvien.addPartTime();
                    break;
                case 3:
                    menu = false;
                    break;
            }
        }
    }
}
