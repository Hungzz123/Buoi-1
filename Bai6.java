import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào ba số a, b, c
        System.out.print("Nhập vào số a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập vào số b: ");
        int b = scanner.nextInt();

        System.out.print("Nhập vào số c: ");
        int c = scanner.nextInt();

        // Kiểm tra điều kiện để tạo thành tam giác
        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Ba số " + a + ", " + b + ", " + c + " tạo thành một tam giác.");

            // Tính diện tích và chu vi của tam giác
            double p = (a + b + c) / 2.0;
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            double chuVi = a + b + c;

            System.out.println("Diện tích của tam giác: " + dienTich);
            System.out.println("Chu vi của tam giác: " + chuVi);
        } else {
            System.out.println("Ba số " + a + ", " + b + ", " + c + " không tạo thành tam giác.");
        }

        scanner.close();
    }
}
