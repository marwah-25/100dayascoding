import java.util.Scanner;

public class day84soal1 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = m.nextInt();

        if (jumlahData <= 0) {
            System.out.println("Jumlah data harus lebih dari 0.");
        } else {
            int[] nilai = new int[jumlahData];

            for (int i = 0; i < nilai.length; i++) {
                System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
                nilai[i] = m.nextInt();
            }

            int tertinggi = nilai[0];
            for (int i = 1; i < nilai.length; i++) {
                if (nilai[i] > tertinggi) {
                    tertinggi = nilai[i];
                }
            }

            System.out.println("Nilai tertinggi: " + tertinggi);
        }
    }
}
