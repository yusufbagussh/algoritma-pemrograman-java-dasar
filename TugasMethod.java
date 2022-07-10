import java.util.Scanner; //Import the Scanner class

class TugasMethod {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a scanner
        // Bagian Deklarasi
        long faktorial = 1;
        int x, n, a, b, c, s1, s2, s3, maksimum = 1, i = 1, absolut = 1;
        String segitiga = "";

        System.out.println("====== Menentukan Nilai Absolut ======");
        System.out.print("Inputkan Nilai : ");
        x = masukan.nextInt();
        masukan.nextLine();
        System.out.println("Nilai mutlak dari x adalah " + NilaiAbsolut(absolut, x));
        System.out.println("--------------------------------------");
        System.out.println("===== Menentukan Nilai Faktorial =====");
        System.out.print("Inputkan Nilai yang di Faktorial: ");
        n = masukan.nextInt();
        masukan.nextLine();
        System.out.println("Faktorial dari " + n + " adalah " + MencariFaktorial(faktorial, i, n));
        System.out.println("--------------------------------------");
        System.out.println("==== Menentukan Bilangan Terbesar ====");
        System.out.print("Masukan Nilai Pertama :");
        a = masukan.nextInt(); // Read user input string
        System.out.print("Masukan Nilai Kedua :");
        b = masukan.nextInt();
        System.out.print("Masukan Nilai Ketiga:");
        c = masukan.nextInt();
        System.out.println("Nilai maksimal :" + BilanganTerbesar(a, b, c, maksimum));
        System.out.println("--------------------------------------");
        System.out.println("====== Menentukan Jenis Segitiga =====");
        System.out.print("Masukan Sisi Pertama :");
        s1 = masukan.nextInt(); // Read user input string
        System.out.print("Masukan Sisi Kedua :");
        s2 = masukan.nextInt();
        System.out.print("Masukan Sisi Ketiga:");
        s3 = masukan.nextInt();
        System.out.println("Jenis Segitiga : Segitiga " + JenisSegitiga(s1, s2, s3, segitiga));
        System.out.println("--------------------------------------");
    }

    public static long NilaiAbsolut(int absolut, int x) {
        if (x < 0) {
            absolut = -1 * x;
            return absolut;
        } else if (x > 0) {
            absolut = x;
            return absolut;
        } else {
            absolut = 0;
            return absolut;
        }
    }

    public static long MencariFaktorial(long faktorial, int i, int n) {
        faktorial = 1;
        for (i = 1; i <= n; i++) {
            faktorial = faktorial * i;
        }
        return faktorial;
    }

    public static int BilanganTerbesar(int a, int b, int c, int maksimum) {
        if (a > b & a > c) {
            maksimum = a;
            return a;
        } else if (b > a & b > c) {
            maksimum = b;
            return b;
        } else {
            maksimum = c;
            return c;
        }
    }

    public static String JenisSegitiga(int s1, int s2, int s3, String segitiga) {
        // int
        if (s1 == s2 && s2 == s3 && s1 == s3) {
            segitiga = "samasisi";
            return segitiga;
        } else if (s1 == s2 && s2 != s3 || s2 == s3 && s1 != s3 || s1 == s3 && s1 != s2) {
            segitiga = "samakaki";
            return segitiga;
        } else {
            segitiga = "sembarang";
            return segitiga;
        }

    }
}