import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị cho biến ký tự color: ");
        char color = scanner.next().charAt(0);

        // Xác định giá trị của color và in ra thông báo tương ứng
        switch (Character.toUpperCase(color)) {
            case 'R':
                System.out.println("RED");
                break;
            case 'G':
                System.out.println("GREEN");
                break;
            case 'B':
                System.out.println("BLUE");
                break;
            default:
                System.out.println("BLACK");
        }

        scanner.close();
    }
}
