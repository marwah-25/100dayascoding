import java.util.Scanner;

public class day71 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int n = m.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
