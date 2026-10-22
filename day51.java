import java.util.Scanner;

public class day51 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = m.nextInt();

        for (int baris = 1; baris <= tinggi; baris++) {
            for (int kolom = 1; kolom <= baris; kolom++) {
                System.out.print(kolom);
            }
            System.out.println();
        }

        m.close();
    }
}
