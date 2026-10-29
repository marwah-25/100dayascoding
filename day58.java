import java.util.Scanner;

public interface day58 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        int n = m.nextInt();
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
            } 
        }
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            } 
            
        }
    }
}
