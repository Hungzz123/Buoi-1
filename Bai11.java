import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số x: ");
        double x = scanner.nextDouble();

        System.out.print("Nhập vào số y: ");
        double y = scanner.nextDouble();

        System.out.print("Nhập vào toán tử (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Xử lý và in ra kết quả tương ứng với toán tử
        switch (operator) {
            case '+':
                System.out.println("Kết quả: " + (x + y));
                break;
            case '-':
                System.out.println("Kết quả: " + (x - y));
                break;
            case '*':
                System.out.println("Kết quả: " + (x * y));
                break;
            case '/':
                if (y != 0) {
                    System.out.println("Kết quả: " + (x / y));
                } else {
                    System.out.println("Không thể chia cho 0.");
                }
                break;
            default:
                System.out.println("Toán tử không hợp lệ. Vui lòng nhập +, -, *, /.");
        }

        scanner.close();
    }
}
