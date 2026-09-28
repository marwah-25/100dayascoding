import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan nilai pertama : ");
        int pertama = m.nextInt();

        System.out.print("Masukkan nilai kedua   : ");
        int kedua = m.nextInt();

        System.out.println("Nilai pertama sama dengan nilai kedua    : "+(pertama==kedua));
        System.out.println("Nilai pertama berbeda dengan nilai kedua : "+(pertama!=kedua));
        
    }
    
}
