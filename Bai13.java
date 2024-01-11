import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số giờ làm: ");
        int soGioLam = scanner.nextInt();

        System.out.print("Nhập lương giờ: ");
        double luongGio = scanner.nextDouble();

        double tongLuong = tinhLuong(soGioLam, luongGio);

        System.out.println("Tổng số tiền lương là: " + tongLuong);
    }

    private static double tinhLuong(int soGioLam, double luongGio) {
        double tongLuong;

        if (soGioLam > 40) {
            int gioThem = soGioLam - 40;
            tongLuong = 40 * luongGio + gioThem * 1.5 * luongGio;
        } else {
            tongLuong = soGioLam * luongGio;
        }

        return tongLuong;
    }
}
