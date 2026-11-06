import java.util.Scanner;

public class day66 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        int n = m.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }

        m.close();
    }
}
