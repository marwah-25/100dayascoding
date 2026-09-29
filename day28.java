public class day28 {
    public static void main(String[] args) {
        // Inisialisasi variabel awal: a bernilai 5
        int a = 5;

        // Postfix Increment: nilai a (5) dimasukkan ke b dulu, baru nilai a bertambah (1) menjadi 6
        int b = a++;

        // Prefix Increment: nilai a (6) dinaikkan dulu menjadi 7, baru nilai 7 dimasukkan ke c
        int c = ++a;

        // Prefix Decrement: nilai c (7) dikurangi dulu menjadi 6, baru nilai 6 dimasukkan ke d
        int d = --c;

        // Postfix Increment: nilai d (6) dimasukkan ke e dulu, baru nilai d bertambah menjadi 7
        int e = d--;

        // Cetak nilai akhir 
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(c); 
        System.out.println(d); 
        System.out.println(e); 
    }
}
