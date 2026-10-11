import java.net.Socket;
import java.util.Scanner;

public class evaluasi2Soal3 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.println("=== MESIN KOPI OTOMATIS ===");
        System.out.println("1. Kopi Hitam (Rp 5000)");
        System.out.println("2. Cappuccino (Rp 10000) ");
        System.out.println("3. Teh Manis (Rp 4000)");
        System.out.println("===========================");
        
        System.out.print("Pilih nomor minuman (1/2/3): ");
        int no = m.nextInt();

        if (no == 1) {
            System.out.println("nda memilih Kopi Hitam Silakan masukkan uang sebesar Rp 5000");
            
        }else if (no == 2) {
            System.out.println("Anda memilih Cappuccino. Silakan masukkan uang sebesar Rp 10000. ");
            
        }else if (no == 3) {
            System.out.println("Anda memilih Teh Manis. Silakan masukkan uang sebesar Rp 4000.");
            
        }else{
            System.out.println("Pilihan tidak valid! Minuman tidak ditemukan.");
        }
    }
    
}
