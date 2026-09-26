import java.util.Scanner;
public class day25 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan jari-jari : ");
        int r = a.nextInt();

        final double PHI = 3.14;

        double luas = PHI * r * r;
        double keliling = 2 * PHI * r;
        System.out.println("Luas lingkaran     : "+luas);
        System.out.println("Keliling lingkaran : "+keliling);

        
    }
    
}
