import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerNhanVien  {
    private List<NhanVien> nhanvien;
    private List<NhanVienFulltime> nhanVienFulltimes;

    public List<NhanVienFulltime> getNhanVienFulltimes() {
        return nhanVienFulltimes;
    }

    public void setNhanVienFulltimes(List<NhanVienFulltime> nhanVienFulltimes) {
        this.nhanVienFulltimes = nhanVienFulltimes;
    }

    public ManagerNhanVien(List<NhanVien> nhanvien) {
        this.nhanvien = nhanvien;
    }

    public ManagerNhanVien() {

    }

    public List<NhanVien> getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(List<NhanVien> nhanvien) {
        this.nhanvien = nhanvien;
    }


    public  void addNhanVien(NhanVien nhanVien){
        this.nhanvien.add(nhanVien);
    }

    public void addFullTime() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter ID: ");
        String id = sc1.nextLine();
        System.out.print("Enter Name: ");
        String name = sc1.nextLine();
        System.out.print("Enter Age: ");
        int age = sc1.nextInt();
        System.out.print("Enter Phone: ");
        int phone = sc1.nextInt();
        System.out.print("Enter Email: ");
        String email = new Scanner(System.in).nextLine();
        System.out.print("Enter Bonus: ");
        float bonus = sc1.nextFloat();
        System.out.print("Enter FineBonus: ");
        float finebonus = sc1.nextFloat();
        System.out.print("Enter Salary: ");
        float salary = sc1.nextFloat();
        NhanVienFulltime s = new NhanVienFulltime(id, name, age,phone,email,bonus,finebonus,salary);
        nhanvien.add(s);

        //String id, String fullname, int age, int phone, String email, float bonus, float finebonus, float salary
    }

    public void addPartTime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Phone: ");
        int phone = sc.nextInt();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Time: ");
        float time = sc.nextFloat();

        NhanVienParttime s = new NhanVienParttime(id, name, age,phone,email, (int) time);
        nhanvien.add(s);

        //String id, String fullname, int age, int phone, String email, float bonus, float finebonus, float salary
    }

    //(String id, String fullname, int age, int phone, String email, int time

    public  void displayNhanVien(){
        for ( NhanVien nhanVienFulltime: nhanvien) {
            System.out.println(nhanVienFulltime);
        }
    }
    List<NhanVien> lstTrungBinh(){
        List<NhanVien> nhanViens = new ArrayList<>();
        float sum = 0;
        double tb = 0;
        for (NhanVien nhanVien : lstTrungBinh()) {
            sum += nhanVien.getSalary();
        }

        tb = sum/nhanViens.size();

        for(int i = 0; i < nhanViens.size(); i++){
            if(tb > nhanViens.get(i).getSalary()){
                nhanViens.add(nhanViens.get(i));
            }
        }

        return nhanViens;
    }
    public double salaryPartTime(){
        double salary = 0;
        for (NhanVien nhanVien : nhanvien) {
            if(nhanVien instanceof NhanVienParttime){
                salary += nhanVien.getSalary();
            }
        }
        return salary;
    }


}
