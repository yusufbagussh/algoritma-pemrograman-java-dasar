import java.util.Scanner; //Import the Scanner class

class PerkalianBilangan {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        int i, n, x, jumlah = 1;
        // x = nilai data ke-n

        System.out.print("Masukan banyak data yang ingin dikalikan: ");
        n = masukan.nextInt();
        masukan.nextLine();
        for (i = 1; i <= n; i++) {
            System.out.print("Data ke-" + i + " :");
            x = masukan.nextInt();
            masukan.nextLine();
            jumlah = jumlah * x;
        }

        System.out.println("Hasil perkalian dari ke-" + n + " bilangan : " + jumlah);

    }
}