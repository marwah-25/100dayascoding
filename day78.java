    import java.util.Scanner;
public class day78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== REGISTRASI AKUN ===");
        System.out.print("Buat username: ");
        String usernameAkun = sc.nextLine();
        System.out.print("Buat password: ");
        String passwordAkun = sc.nextLine();

        System.out.println("Akun berhasil dibuat!");
        System.out.println("\n=== LOGIN AKUN ===");

        boolean berhasilLogin = false;

        do {
            System.out.print("Masukkan username: ");
            String usernameLogin = sc.nextLine();
            System.out.print("Masukkan password: ");
            String passwordLogin = sc.nextLine();

            if (usernameLogin.equals(usernameAkun) && passwordLogin.equals(passwordAkun)) {
                System.out.println("Selamat, Login Berhasil!");
                berhasilLogin = true;
            } else {
                System.out.println("Username atau password salah.");
                System.out.println("Silakan login kembali.\n");
            }
        } while (!berhasilLogin);
    }
    
}
