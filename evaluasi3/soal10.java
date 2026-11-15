import java.util.Scanner;

public class soal10 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan batas angka(n): ");
        int n = m.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i>10) {
                break;
            }
            if(i % 3 == 0) {
                continue;
    
            }
            System.out.print(i+" ");
            
        }
    }
}
