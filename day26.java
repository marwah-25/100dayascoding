import java.util.Scanner;

public class day26 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        //soal1
        System.out.print("Masukkan Nama\t : ");
        String a = m.nextLine();

        System.out.print("Masukkan NIM\t : ");
        String b = m.nextLine();

        System.out.print("Masukkan Kelas\t : ");
        char c = m.next().charAt(0);

        System.out.print("Masukkan Umur\t : ");
        int d = m.nextInt();
        m.nextLine();

        System.out.print("Masukkan Prodi\t : ");
        String e = m.nextLine();

        System.out.print("Masukkan IPK\t : ");
        double f = m.nextDouble();

        System.out.print("Status Keaktifan : ");
        boolean g = m.nextBoolean();

        System.out.println("==== BIODATA MAHASISWA ====");
        System.out.println("Nama\t     : "+a);
        System.out.println("NIM\t     : "+b);
        System.out.println("Kelas\t     : "+c);
        System.out.println("Umur\t     : "+d);
        System.out.println("Prodi\t     : "+e);
        System.out.println("IPK\t     : "+f);
        System.out.println("Status Aktif : "+g);
        System.out.println("===========================");



        //soal2
        double jari = m.nextDouble();
        final double PI = 3.14;
        double luas = PI *jari*jari;
        System.out.println(luas);
    

        //soal3
        int angka1 = m.nextInt();
        int angka2 = m.nextInt();
        int angka3 = angka1;
        angka1 = angka2;
        angka2 = angka3;

        System.out.println(angka1);
        System.out.println(angka2);


    }
    
}
