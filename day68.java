import java.util.Scanner;

public class day68 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        int n = m.nextInt();
        int M = m.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= M; j++) {
                if (j == M && i == n) {
                    System.out.print("*");
                } else {
                    System.out.print("*");
                }
            }
        }

        m.close();
    }
}
