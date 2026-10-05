import java.util.Scanner;

public class day34 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian    : ");
        int nilai = m.nextInt();

        System.out.print("Apakah sudah terdaftar? : ");
        boolean terdaftar = m.nextBoolean();

        System.out.println();
        if (nilai >= 80 && nilai <= 100 ) {
            System.out.println("Kategori Nilai : Sangat Baik");
        }else if (nilai >= 70 && nilai <= 79) {
            System.out.println("Kategori Nilai : Baik");
        }else if (nilai >= 60 && nilai <= 69 ) {
            System.out.println("Kategori Nilai : Cukup");
        }else{
            System.out.println("Kategori Nilai : Kurang");
        }


        if (nilai >= 60 && terdaftar) {
            System.out.println("Status         : Lulus "  );
        }else{
            System.out.println("Status         : Tidak Lulus ");
        }
    }
    
}
