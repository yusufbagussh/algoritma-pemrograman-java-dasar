import java.util.Scanner; //Import the Scanner class

class JumlahGeometri {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        int n, i, a, r, Un, jumlah = 0, rn = 1;

        System.out.print("Masukkan nilai awal: ");
        a = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukkan nilai rasio: ");
        r = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukkan banyak data: ");
        n = masukan.nextInt();
        masukan.nextLine();

        // Cetak bilangan ganjil pertama
        for (i = 1; i <= n; i++) {
            rn *= r;
            Un = a * rn / r;
            System.out.println("Suku ke-" + i + " : " + Un);
            jumlah = jumlah + Un;
        }

        System.out.println("Jumlah bilangan gemometri dari " + n + " data adalah " + jumlah);

    }
}