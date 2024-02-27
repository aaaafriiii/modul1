import java.util.Scanner;

public class code {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin123";
    private static final int NIM_LENGTH = 15;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang!");

        while (true) {
            System.out.println("Silakan pilih jenis user (admin/mahasiswa):");
            String userType = scanner.nextLine();

            if (userType.equalsIgnoreCase("admin")) {
                adminLogin(scanner);
                break;
            } else if (userType.equalsIgnoreCase("mahasiswa")) {
                mahasiswaLogin(scanner);
                break;
            } else {
                System.out.println("Jenis user tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }

    private static void adminLogin(Scanner scanner) {
        System.out.println("Masukkan username:");
        String username = scanner.nextLine();
        System.out.println("Masukkan password:");
        String password = scanner.nextLine();

        if (username.equals(USERNAME) && password.equals(PASSWORD)) {
            System.out.println("berhasil!");
        } else {
            System.out.println("salah.");
        }
    }

    private static void mahasiswaLogin(Scanner scanner) {
        System.out.println("(nim harus 15 karakter):");
        String nim = scanner.nextLine();

        if (nim.length() == NIM_LENGTH) {
            System.out.println("Login mahasiswa berhasil!");
        } else {
            System.out.println("Panjang NIM tidak valid.");
        }
    }
}