import java.util.Scanner;

public class day37 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan Kode Energi: ");
        int kode = m.nextInt();
        
        System.out.println();

        if (kode > 0) {
            if (kode % 2 == 0) {
                System.out.println("Kode Diterima (Energi Positif).");
                System.out.println("Berhasil!! Pintu Brankas Utama Terbuka, dokumen rahasia diamankan!");
                
            }else{
                System.out.println("Kode Diterima (Energi Positif).");
                System.out.println("JEBAKAN! Pintu terbuka tapi menyemprotkan Gas Beracun!");
            }
        }if (kode < 0) {
            if (kode % 2 == 0) {
                System.out.println("HACKER TERDETEKSI (Energi Negatif). ");
                System.out.println("Peringatan! Alarm Level 1 Berbunyi!");
                
            }else{
                System.out.println("HACKER TERDETEKSI (Energi Negatif). ");
                System.out.println("Peringatan Kritis! Pintu ruangan terkunci, Robot penjaga dikerahkan!");
            }
            
        }else {
            System.out.println("Sistem brankas dimatikan. Harap mulai ulang.");
        }
    } 
}
