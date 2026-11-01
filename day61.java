import java.util.Scanner;

public class day61 {
    public static void main(String[] args) {
       Scanner m = new Scanner(System.in);
       int n = m.nextInt();

        int total = 1;
        for (int i = 1; i <= n; i++) {
            total*=i;           
        }
        System.out.print(total); 
    }
    
}
