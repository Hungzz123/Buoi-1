import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chỉ số cũ và chỉ số mới
        System.out.print("Nhập chỉ số cũ: ");
        int chiSoCu = scanner.nextInt();

        System.out.print("Nhập chỉ số mới: ");
        int chiSoMoi = scanner.nextInt();

        // Kiểm tra điều kiện chỉ số mới không được nhỏ hơn chỉ số cũ
        if (chiSoMoi < chiSoCu) {
            System.out.println("Chỉ số mới không được nhỏ hơn chỉ số cũ. Vui lòng nhập lại.");
            return;
        }

        // Tính số KW sử dụng và tiền điện
        int soKW = chiSoMoi - chiSoCu;
        double tienDinhMuc = tinhTienDinhMuc(soKW);
        double tienVuotDinhMuc = tinhTienVuotDinhMuc(soKW);

        // Tổng tiền phải trả
        double tongTien = tienDinhMuc + tienVuotDinhMuc;

        // In kết quả
        System.out.println("Chỉ số cũ: " + chiSoCu);
        System.out.println("Chỉ số mới: " + chiSoMoi);
        System.out.println("Tiền trả định mức: " + tienDinhMuc + "đ");
        System.out.println("Tiền trả vượt định mức: " + tienVuotDinhMuc + "đ");
        System.out.println("Tổng tiền phải trả: " + tongTien + "đ");
    }

    private static double tinhTienDinhMuc(int soKW) {
        int dinhMuc = 50;
        double giaDinhMuc = 230;
        return dinhMuc * giaDinhMuc;
    }

    private static double tinhTienVuotDinhMuc(int soKW) {
        int vuotDinhMuc1 = 50;
        int vuotDinhMuc2 = 100;
        double giaVuotDinhMuc1 = 480;
        double giaVuotDinhMuc2 = 700;
        double giaVuotDinhMuc3 = 900;

        double tienVuotDinhMuc = 0;

        if (soKW > vuotDinhMuc2) {
            tienVuotDinhMuc += (soKW - vuotDinhMuc2) * giaVuotDinhMuc3;
            soKW = vuotDinhMuc2;
        }

        if (soKW > vuotDinhMuc1) {
            tienVuotDinhMuc += (soKW - vuotDinhMuc1) * giaVuotDinhMuc2;
            soKW = vuotDinhMuc1;
        }

        tienVuotDinhMuc += soKW * giaVuotDinhMuc1;

        return tienVuotDinhMuc;
    }
}
