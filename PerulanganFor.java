import java.util.Scanner; //Import the Scanner class

class PerulanganFor {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object
        // Bagian Deklarasi
        int i, jmlulang, U;
        System.out.print("Inputkan jumlah perulangan: ");
        jmlulang = masukan.nextInt();
        masukan.nextLine();
        // Perintah For
        // for (i = 1; i <= jmlulang; i++)// nilai awal, kondisi, terminasi
        // {
        // System.out.println("Selamat Pagi!");// badan perulangan
        // }
        // for (i = 1; i <= jmlulang; i++)
        // {
        // System.out.println("Cetak kata ke-" + i);
        // }
        // //lompat 2 angka
        for (i = jmlulang; i >= 1; i--)
        // i=i-1
        {
            System.out.println("Cetak kata ke-" + i);
        }
        // Cetak bil ganjil antara 1-n (n diinput)
        // for (i = 1; i <= jmlulang; i++) {
        // if (i % 2 == 1) {
        // System.out.println(i);
        // }
        // }
        // Cetak bil ganjil antara 1-n (n diinput)
        // for (i = 1; i <= jmlulang; i += 2) {
        // System.out.println(i);
        // }
        // // Cetak bilangan genap pertama
        // for (i = 1; i <= jmlulang; i++) {
        // U = 2 * i;
        // System.out.println(U);
        // }
        // Cetak bilangan ganjil pertama
        // for (i = 1; i <= jmlulang; i++) {
        // U = 2 * i - 1;
        // System.out.println(U);
        // }
    }
}

// suhu = 4/5 * suhuC;
// suhu = 9/5 * suhuC + 32;
// suhu = suhuC + 273;