import java.util.Scanner;

public class day87soal1 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = m.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
        } else {
            int[] nilai = new int[jumlah];

            for (int i = 0; i < nilai.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilai[i] = m.nextInt();
            }

            System.out.println("\nData sebelum diubah:");
            for (int i = 0; i < nilai.length; i++) {
                System.out.print(nilai[i] + " ");
            }

            System.out.print("\n\nMasukkan indeks yang ingin diubah: ");
            int indeks = m.nextInt();

            if (indeks >= 0 && indeks < nilai.length) {
                System.out.print("Masukkan nilai baru: ");
                nilai[indeks] = m.nextInt();

                System.out.println("\nData setelah diubah:");
                for (int i = 0; i < nilai.length; i++) {
                    System.out.print(nilai[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("Indeks tidak valid.");
            }
        }

    }
    
}
