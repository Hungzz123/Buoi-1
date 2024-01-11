import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào 4 số nguyên
        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        System.out.print("Nhập số nguyên c: ");
        int c = scanner.nextInt();

        System.out.print("Nhập số nguyên d: ");
        int d = scanner.nextInt();

        // Tìm số lớn nhất trong 2 cặp (a, b) và (c, d)
        int maxAB = (a > b) ? a : b;
        int maxCD = (c > d) ? c : d;

        // Tìm số lớn nhất giữa maxAB và maxCD
        int maxNumber = (maxAB > maxCD) ? maxAB : maxCD;

        // In ra số lớn nhất
        System.out.println("Số lớn nhất là: " + maxNumber);

        scanner.close();
    }
}
