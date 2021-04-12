public abstract class NhanVien {
    private String id;
    private String fullname;
    private int age;
    private int phone;
    private String email;

    public NhanVien() {
    }

    public NhanVien(String id, String fullname, int age, int phone, String email) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public abstract double getSalary();


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
