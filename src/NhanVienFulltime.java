public class NhanVienFulltime extends NhanVien{
    private float bonus;
    private float finebonus;
    private float salary;

    public NhanVienFulltime() {

    }

    @Override
    public double getSalary() {
        return salary + (bonus - finebonus);
    }
    @Override
    public String toString() {
        return "NhanVienFulltime{" +
                "ID=" + this.getId() +
                ", FullName='" + this.getFullname() + '\'' +
                ", Age=" + this.getAge() +
                ", Phone=" + this.getPhone() +
                ", Email='" + this.getEmail() + '\'' +
                "Bonus=" + this.getBonus() +
                ", FineBonus=" + this.getFinebonus() +
                ", Salary=" + this.getSalary() +
                '}';
    }



    public NhanVienFulltime(String id, String fullname, int age, int phone, String email, float bonus, float finebonus, float salary) {
        super(id, fullname, age, phone, email);
        this.bonus = bonus;
        this.finebonus = finebonus;
        this.salary = salary;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float getFinebonus() {
        return finebonus;
    }

    public void setFinebonus(float finebonus) {
        this.finebonus = finebonus;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
//1: Xây dựng lớp NhanVien để nhóm các thuộc tính chung.- Các thuộc tính của lớp nhân viên bao gồm:
//        mã nhân viên, họ tên,tuổi, số điện thoại, email
//        2: Xây dựng lớp NhanVienFulltime kế thừa từ lớp NhanVien.
//        - Lớp NhanVienFulltime có chứa thuộc tính số tiền thưởng, số tiềnphạt, lương cứng
//        3: Xây dựng lớp NhanVienParttime kế thừa từ lớp NhanVien.
//        -Lớp NhanVienParttime có chứa thuộc tính số giờ làm việc
//        4: Viết phương thức hiển thị thông tin của tất cả nhân viên.
//        5: Xây dựng phương thức tính lương thực lĩnh cho nhân viên toàn thời gianvà nhân viên bán thời gian theo công thức sau:
//        • Lương thực lĩnh (fulltime)  = lương cứng + (số tiền thưởng – số tiền phạt).
//        • Lương thực lĩnh (  parttime) = số giờ làm việc * 100000
//        6: Viết phương thức thêm mới nhân viên.
//        7: Viết phương thức liệt kê danh sách nhân viên toàn thời gian có mức lương thấp hơn mức lương trung bình của các nhân viên trong công ty.
//        8: Viết phương thức tính số lương phải trả cho tất cả các nhân viên bán thời gian
