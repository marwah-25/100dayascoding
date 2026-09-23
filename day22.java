import java.util.Scanner;

public class day22 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Masukkan nilai a : ");
        int a = p.nextInt();

        System.out.print("Masukkan nilai b : ");
        int b = p.nextInt();

        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        
        int c = a;
        System.out.println("Dengan variabel tambahan:");
        System.out.println("a = " + b);
        System.out.println("b = " + c);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Tanpa variabel tambahan:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
