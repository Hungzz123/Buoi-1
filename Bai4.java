import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Giải phương trình bậc 2: ax^2 + bx + c = 0");
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Phương trình không phải là phương trình bậc 2.");
        } else {
            System.out.print("Nhập b: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập c: ");
            double c = scanner.nextDouble();

            // Tính delta
            double delta = b * b - 4 * a * c;

            if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else {
                // Tính các nghiệm phân biệt
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        scanner.close();
    }
}
