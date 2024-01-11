import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin sinh viên
        System.out.println("Nhập thông tin sinh viên:");
        System.out.print("Tên sinh viên: ");
        String tenSinhVien = scanner.nextLine();

        System.out.print("Mã sinh viên: ");
        String maSinhVien = scanner.nextLine();

        System.out.print("Điểm lý thuyết Java: ");
        double diemLyThuyet = scanner.nextDouble();

        System.out.print("Điểm thực hành Java: ");
        double diemThucHanh = scanner.nextDouble();

        // Tính điểm trung bình
        double diemTrungBinh = (diemLyThuyet + diemThucHanh) / 2;

        // Hiển thị xếp loại
        System.out.println("\nXếp loại:");

        if (diemLyThuyet < 4) {
            System.out.println("Thi lại lý thuyết");
        }

        if (diemThucHanh < 4) {
            System.out.println("Thi lại thực hành");
        }

        if (diemTrungBinh < 4) {
            System.out.println("Sinh viên phải học lại");
        } else if (diemTrungBinh >= 4 && diemTrungBinh <= 7) {
            System.out.println("Sinh viên đạt môn Java");
        } else {
            System.out.println("Sinh viên xuất sắc môn Java");
        }

        scanner.close();
    }
}
