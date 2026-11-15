import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan batas angka(n): ");
        int n = m.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);
        System.out.println();
        
    }
    
}
