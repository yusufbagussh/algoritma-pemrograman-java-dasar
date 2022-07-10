import java.util.Scanner; //Import the Scanner class

class PerulanganRataKonfirmasiInput {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);
        char konfirmasi;
        konfirmasi = 'y';

        while (konfirmasi == 'y') {
            System.out.println("Selamat Siang");
            System.out.print("Cetak Lagi? (y/n) : ");
            konfirmasi = masukan.next().charAt(0);
            masukan.nextLine();
        }

    }
}