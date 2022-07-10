import java.util.Scanner; //Import the Scanner class

class PerulanganJumlahAritmatika {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        int i, a, b, n, Un, jumlah = 0;

        System.out.print("Masukkan nilai awal: ");
        a = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukkan nilai beda: ");
        b = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukkan banyak data: ");
        n = masukan.nextInt();
        masukan.nextLine();

        // Cetak bilangan ganjil pertama
        for (i = 1; i <= n; i++) {
            Un = a + (i - 1) * b;
            System.out.println("Suku ke-" + i + " : " + Un);
            jumlah = jumlah + Un;
        }

        System.out.println("Jumlah bilangan aritmatika : " + jumlah);

    }
}