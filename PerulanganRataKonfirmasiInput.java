import java.util.Scanner; //Import the Scanner class

class PerulanganRataKonfirmasiInput {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);
        char konfirmasi;
        int jumlah = 0, i = 1, x, n;
        double rata;
        konfirmasi = 'y';

        while (konfirmasi == 'y') {
            System.out.print("Masukkan data ke-" + i + ":");
            x = masukan.nextInt();
            masukan.nextLine();
            System.out.print("Banyak Data :");
            n = masukan.nextInt();
            masukan.nextLine();
            i++;
            jumlah = jumlah + x;
            rata = jumlah / n;
            System.out.println("Jumlah bilangan : " + jumlah);
            System.out.println("Rata-rata bilangan : " + rata);
            System.out.print("Apakah ingin menambah data? (y/n) : ");
            konfirmasi = masukan.next().charAt(0);
            masukan.nextLine();
        }

    }
}