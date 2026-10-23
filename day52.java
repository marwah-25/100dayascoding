import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan PIN: ");
        int pin = m.nextInt();

        while (pin != 123456) {
            System.out.println("PIN Salah. Silakan coba lagi.");
            System.out.print("Masukkan PIN: ");
            pin = m.nextInt();
        }

        System.out.println("PIN Benar. Akses Diberikan.");

        m.close();
    }
}
