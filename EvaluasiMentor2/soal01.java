
import java.util.Scanner;

public class evaluasi2Soal1 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan umur anda: ");
        int umur = m.nextInt();
        System.out.print("Apakah membawa KTP Asli? (true/false) : ");
        boolean KTP = m.nextBoolean();

        if (umur >= 17 && KTP) {
            System.out.println("Pendaftaran Diterima! Silakan lanjut ke foto.");
        }else {
            System.out.println("Pendaftaran Ditolak! Usia belum mencukupi atau KTP tidak ada. ");
        }
        
       
        }
    
}
