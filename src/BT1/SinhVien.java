package BT1;


public class SinhVien {
    //Khai báo biến static
    static String majors = " Tester";

    //Khai báo biến instance
    String className = "06QD5.2";

    //Tạo hàm để in ra biến local
    public static void getName() {
        //Khai báo biến local
        String name = "DieuMTT";
        System.out.println("Họ và tên:" + name);
    }

    //Tạo hàm để in ra biến static
    public static void getMajors() {
        System.out.println("Chuyên ngành là:" + majors);
    }

    //Tạo hàm để in ra biến instance
    public static void getClassName() {
        //Khởi tạo object obj từ class SinhVien
        SinhVien obj = new SinhVien();
        System.out.println("Tên lớp:" + obj.className);
    }


    public static void main(String[] args) {
        //In biến static thông qua hàm
        getMajors();

        //In biến local thông qua hàm
        getName();

        //In biến instance thông qua hàm
        getClassName();

        //Gọi biến static từ class ThongTin
        System.out.println("Tên trường:" + ThongTin.schoolName);
        ThongTin.stt = 1;
        System.out.println("STT:" + ThongTin.stt);


    }
}

