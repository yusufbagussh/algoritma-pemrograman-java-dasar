import java.util.Scanner; //Import the Scanner class

class MenghitungRata {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        int i, n;
        double x, rata, jumlah = 0;
        // x = nilai data ke-n

        System.out.print("Masukan banyaknya data: ");
        n = masukan.nextInt();
        masukan.nextLine();

        for (i = 1; i <= n; i++) {
            System.out.print("Data ke-" + i + " :");
            x = masukan.nextDouble();
            masukan.nextLine();
            jumlah = jumlah + x;
        }
        // while (i <= n) {
        // System.out.print("Data ke-" + i + " :");
        // x = masukan.nextDouble();
        // masukan.nextLine();
        // juml += x;
        // i++;
        // }
        rata = jumlah / n;
        System.out.println("Jumlah dari " + n + " bilangan : " + jumlah);
        System.out.println("Rata - rata " + n + " bilangan : " + rata);

    }
}