import java.util.Scanner;

public class day76 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String namaAwal = m.nextLine();

        String namaTrim = namaAwal.trim();
        String tigaKarakter = namaTrim.substring(0, 3);
        String namaReplace = namaTrim.replace(' ', '_');

        System.out.println("Nama Awal             : " + namaAwal);
        System.out.println("Nama Setelah Trim     : " + namaTrim);
        System.out.println("Tiga Karakter Pertama : " + tigaKarakter);
        System.out.println("Nama Setelah Replace  : " + namaReplace);

        m.close();
    }
}
