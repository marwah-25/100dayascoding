import java.util.Scanner;

public class day59 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                System.out.print(i+" ");
            }
            
        }
    }
    
}
