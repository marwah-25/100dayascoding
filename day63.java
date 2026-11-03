import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        int M = m.nextInt();
        int N = m.nextInt();

        int hasil = 1;
        for (int i = 1; i <= N; i++) {
            hasil *= M;
        }

        System.out.print(hasil);

    }
}
