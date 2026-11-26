import java.util.Scanner;

public class day86soal {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = m.nextInt();
        m.nextLine();

        if (jumlahMahasiswa <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
        } else {
            String[] nama = new String[jumlahMahasiswa];

            for (int i = 0; i < nama.length; i++) {
                System.out.print("Masukkan nama ke-" + (i + 1) + ": ");
                nama[i] = m.nextLine();
            }

            System.out.print("Masukkan nama yang dicari: ");
            String cari = m.nextLine();

            boolean ditemukan = false;
            for (int i = 0; i < nama.length; i++) {
                if (nama[i].equals(cari)) {
                    ditemukan = true;
                    break;
                }
            }

            if (ditemukan) {
                System.out.println("Nama " + cari + " ditemukan.");
            } else {
                System.out.println("Nama " + cari + " tidak ditemukan.");
            }
        }
    }
}
