import java.util.Scanner;

public class day62 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        int n = m.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == n) {
                    System.out.print(j);
                } else {
                    System.out.print(j + " ");
                }
            }
        }

    }
}
