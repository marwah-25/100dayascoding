import java.util.Scanner;
public class day24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int p = input.nextInt();

        System.out.print("Masukkan lebar: ");
        int lb = input.nextInt();

        int l = p*lb;
        int k = 2*(p+lb);
        System.out.println("Luas Persegi Panjang     : "+l);
        System.out.println("Keliling Persegi Panjang : "+k);
    }
}
