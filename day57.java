import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        int n = m.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
            } 
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            } 
            
        }
    }
    
}
