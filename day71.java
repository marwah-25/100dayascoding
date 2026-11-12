import java.util.Scanner;

public class day71 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        int total = 0;

        System.out.print("Masukkan pemasukan (angka negatif untuk berhenti): ");
        int pemasukan = m.nextInt();

        while (pemasukan >= 0) {
            total += pemasukan;
            System.out.print("Masukkan pemasukan (angka negatif untuk berhenti): ");
            pemasukan = m.nextInt();
        }

        System.out.println("Total seluruh pemasukan: Rp " + total);
    }
}
