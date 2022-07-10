import java.util.Scanner; //Import the Scanner class

class PerulanganWhile {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object
        // Bagian Deklarasi
        int i, jmlulang, U;
        System.out.print("Inputkan jumlah perulangan: ");
        jmlulang = masukan.nextInt();
        masukan.nextLine();

        i = 1;// Nilai awal
        while (i <= jmlulang) // kondisi
        {
            System.out.println("Cetak kata ke-" + i);// Badan Perulangan
            i++;// terminasi
        }

        // deret n bilangan ganjil pertama
        i = 1;
        while (i <= jmlulang) {
            U = 2 * i - 1;
            System.out.print(U + " ");
            i++;
        }

    }
}