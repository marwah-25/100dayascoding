import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        
        System.out.print("Masukkan total kembalian: ");
        int total = m.nextInt();

        System.out.println();
        int pecahan1 = 50000;
        int pecahan2 = 10000;
        int pecahan3 = 1000;
        System.out.println("Pecahan "+pecahan1+" : "+ total/pecahan1 + " lembar");
        int sisa = total%pecahan1;
        System.out.println("Pecahan "+ pecahan2+" : "+sisa/pecahan2+" lembar");
        int sisa2 = total%pecahan2;
        System.out.println("Pecahan "+pecahan3+" : "+sisa2/pecahan3+ " lembar");
        


    }
}
