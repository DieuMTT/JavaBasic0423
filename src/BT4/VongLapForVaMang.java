package BT4;

public class VongLapForVaMang {
    public static void main(String[] args) {
        //Tạo mảng để lưu số chẵn từ 0-50
        int mang1[] = new int[51];
        //Tạo vòng lặp for để in ra số chẵn
        System.out.println("In ra số chẵn 0-50 trước khi nạp vào mảng");
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                mang1[i] = i; //Nạp số chẵn vào mảng
            }
        }
        //Duyệt mảng để in ra kết quả sau khi nạp vào
        System.out.println("In ra số chẵn 0-50 sau khi nạp vào mảng");
        for (int i = 1; i < mang1.length; i++) {
            System.out.println(mang1[i]);
        }

    }
}
