import java.util.Scanner;
public class day23 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi : ");
        int sisi = p.nextInt();
        int luas = sisi * sisi;
        int keliling = 4 * sisi;
        System.out.println("Luas persegi     : "+luas);
        System.out.println("Keliling persegi : "+keliling);
        
    }
    
}
