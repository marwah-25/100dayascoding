import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan angka awal : ");
        int awal = m.nextInt();

        System.out.print("Masukkan angka akhir : ");
        int akhir = m.nextInt();

        for (int i = awal; i <= akhir ; i++) {
           System.out.print(i+" ");
                
            }
            
        }
    }

