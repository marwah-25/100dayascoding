import java.util.Scanner;

public class day69 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        int n = m.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print("* ");
                }
            }
            if (i < n) {
                System.out.println();
            }
        }

    }
}
