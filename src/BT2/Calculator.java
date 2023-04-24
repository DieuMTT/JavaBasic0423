package BT2;

public class Calculator {
    public static int tinhTong2SoNguyen(int a, int b){
        return a+b;
    }
    public static float tinhTich2SoThuc(float a, float b){
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println("Tổng 2 số nguyên là: " + tinhTong2SoNguyen(2,5));
        System.out.println("Tích 2 số thực là: " +tinhTich2SoThuc(2.5F,5.2F));
    }
}
