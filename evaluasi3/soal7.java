import java.util.Scanner;

public class soal7 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan ukuran sisi(n): ");
        int n = m.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
    }
}
