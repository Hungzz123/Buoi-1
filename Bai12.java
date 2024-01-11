import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm Toán: ");
        double toan = scanner.nextDouble();

        System.out.print("Nhập điểm Lý: ");
        double ly = scanner.nextDouble();

        System.out.print("Nhập điểm Hóa: ");
        double hoa = scanner.nextDouble();

        double tongDiem = toan + ly + hoa;

        if (tongDiem >= 15 && toan >= 4 && ly >= 4 && hoa >= 4) {
            System.out.println("Kết quả: Đậu");

            if (toan > 5 && ly > 5 && hoa > 5) {
                System.out.println("Lời phê: Học đều các môn");
            } else {
                System.out.println("Lời phê: Học chưa đều các môn");
            }
        } else {
            System.out.println("Kết quả: Thi hỏng");
        }
    }
}
