import java.util.Scanner; //Import the Scanner class

class BilanganFaktorial {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a scanner
        // Bagian Deklarasi
        long faktorial = 1;
        int n, i = 1;
        // MENCARI FAKTORIAL REKURSIF
        System.out.println("===== Menentukan Nilai Faktorial =====");
        System.out.print("Inputkan Nilai yang di Faktorial: ");
        n = masukan.nextInt();
        masukan.nextLine();
        System.out.println("Nilai faktorial dari " + n + " adalah " + MencariFaktorial(faktorial, i, n));
        System.out.println("Nilai faktorial dari " + n + " adalah " + MencariFaktorial2(n));
        System.out.println("Nilai faktorial dari " + n + " adalah " + MencariFaktorialRekursif(n));
        System.out.println("--------------------------------------");
    }

    public static long MencariFaktorial(long faktorial, int i, int n) {
        faktorial = 1;
        for (i = 1; i <= n; i++) {
            faktorial = faktorial * i;
        }
        return faktorial;
    }

    public static int MencariFaktorial2(int n) {
        int hasil = 1;
        for (int i = n; i >= 1; i--) {
            hasil = hasil * i;
        }
        return hasil;
    }

    public static int MencariFaktorialRekursif(int n) {
        int hasil = 1;
        if (n == 1) {
            hasil = 1;
            return hasil;
        } else {
            hasil = n * MencariFaktorialRekursif(n - 1);
            return hasil;
        }
    }
}