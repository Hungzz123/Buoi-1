import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tháng (1-12): ");
        int month = scanner.nextInt();

        // Kiểm tra tháng và in ra số ngày tương ứng
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Tháng " + month + " có 31 ngày.");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Tháng " + month + " có 30 ngày.");
                break;
            case 2:
                System.out.print("Nhập vào năm: ");
                int year = scanner.nextInt();

                // Kiểm tra năm nhuận và in ra số ngày của tháng 2
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Tháng 2 năm " + year + " có 29 ngày.");
                } else {
                    System.out.println("Tháng 2 năm " + year + " có 28 ngày.");
                }
                break;
            default:
                System.out.println("Nhập không hợp lệ. Tháng phải nằm trong khoảng từ 1 đến 12.");
        }

        scanner.close();
    }
}
