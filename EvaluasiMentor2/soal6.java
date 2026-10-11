import java.util.Scanner;

public class evaluasi2Soal6 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan HP : ");
        int Hp = m.nextInt();

        System.out.print("Masukkan Damage : ");
        int damage = m.nextInt();

        System.out.print("Menang? (true/false): ");
        boolean menang = m.nextBoolean();

        int level = 1;

        if (menang == true) {
            level ++;
            System.out.println("Sisa Hp: "+Hp);
            System.out.println("Level: "+level);
        }else if (menang  == false) {
            int kalah = Hp -damage;
            level --;
            System.out.println("Sisa Hp: "+kalah);
            System.out.println("Level: "+level);
        }
    }
}
