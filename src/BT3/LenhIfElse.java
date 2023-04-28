package BT3;

public class LenhIfElse {
    static int number = 100;

    public static void soSanh(int n) {
        if (n == number) {
            System.out.println(n + "\t" + "là bằng" + "\t" + number);
        } else if (n < number) {
            System.out.println(n + "\t" + "là nhỏ hơn" + "\t" + number);
        } else {
            System.out.println(n + "\t" + "là lớn hơn" + "\t" + number);
        }
    }

    public static void main(String[] args) {
        soSanh(50);
    }
}
