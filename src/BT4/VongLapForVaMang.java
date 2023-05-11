package BT4;

public class VongLapForVaMang {
    public static void main(String[] args) {
        // Tạo mảng để lưu những số chẵn từ 0 đến 50
        int MangSoChan[] = new int[26];
        int j = 0; // Biến để gán vị trí cho MangSoChan

        //Tạo vòng lặp FOR để in ra các số chẵn từ 0 đến 50
        System.out.println("Vòng lặp FOR để in ra các số chẵn từ 0 đến 50:");
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                MangSoChan[j] = i;
                j++;
            }
        }
        //Duyệt mảng để in ra kết quả sau khi nạp vào
        System.out.println("In ra các số chẵn từ 0 đến 50 sau khi nạp vào mảng:");
        for (int i = 0; i < MangSoChan.length; i++) {
            System.out.println(MangSoChan[i]);
        }
    }
}
