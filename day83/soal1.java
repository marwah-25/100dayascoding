import java.util.Scanner;

public class day83soal1 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = m.nextInt();

        System.out.println();
        int[] angka = new int[jumlahData];
        int total = 0;

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = m.nextInt();
            total += angka[i];
        }

        System.out.println();
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Angka ke-" + (i + 1) + ": " + angka[i]);
        }
        System.out.println("Total seluruh angka: " + total);

    
    }
}
