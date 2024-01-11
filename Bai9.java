import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn một trong ba lựa chọn: B (Búa), K (Kéo), G (Giấy)");
        System.out.print("Người chơi chọn: ");
        char playerChoice = scanner.next().charAt(0);

        // Chọn ngẫu nhiên từ B, K, G cho máy tính
        char computerChoice = getRandomChoice();

        System.out.println("Máy tính chọn: " + computerChoice);

        // So sánh lựa chọn của người chơi và máy tính
        switch (playerChoice) {
            case 'B':
                switch (computerChoice) {
                    case 'B':
                        System.out.println("Hòa!");
                        break;
                    case 'K':
                        System.out.println("Người chơi thắng! Búa thắng Kéo.");
                        break;
                    case 'G':
                        System.out.println("Máy tính thắng! Giấy thắng Búa.");
                        break;
                }
                break;

            case 'K':
                switch (computerChoice) {
                    case 'B':
                        System.out.println("Máy tính thắng! Búa thắng Kéo.");
                        break;
                    case 'K':
                        System.out.println("Hòa!");
                        break;
                    case 'G':
                        System.out.println("Người chơi thắng! Kéo thắng Giấy.");
                        break;
                }
                break;

            case 'G':
                switch (computerChoice) {
                    case 'B':
                        System.out.println("Người chơi thắng! Giấy thắng Búa.");
                        break;
                    case 'K':
                        System.out.println("Máy tính thắng! Kéo thắng Giấy.");
                        break;
                    case 'G':
                        System.out.println("Hòa!");
                        break;
                }
                break;

            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn B, K hoặc G.");
        }

        scanner.close();
    }

    private static char getRandomChoice() {
        // Phương thức này trả về một lựa chọn ngẫu nhiên từ B, K, G cho máy tính
        int randomNum = (int) (Math.random() * 3);
        switch (randomNum) {
            case 0:
                return 'B';
            case 1:
                return 'K';
            case 2:
                return 'G';
            default:
                return ' '; // Trường hợp không xác định, mặc định trả về khoảng trắng
        }
    }
}
