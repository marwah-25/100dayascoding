import java.util.Scanner;

public class soal12 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        int pinBenar = 1234;
        int pinInput;
        int percobaan = 0;
        
        do {
            System.out.print("Masukkan PIN Anda: ");
            pinInput = m.nextInt();
            percobaan++;
            
            if (pinInput != pinBenar) {
                if (percobaan < 3) {
                    System.out.println("PIN salah, silakan coba lagi!");
                }
            }
        } while (pinInput != pinBenar && percobaan < 3);
        
        if (pinInput == pinBenar) {
            System.out.println("PIN benar! Selamat datang.");
        } else {
            System.out.println("Anda salah 3 kali. Kartu ATM terblokir!");
        }
    }
        
}
