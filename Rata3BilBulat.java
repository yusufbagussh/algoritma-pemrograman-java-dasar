import java.util.Scanner; //Import the Scanner class

class Rata3BilBulat {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object

        // deklarasi
        int a, b, c, jumlah;
        double rata; // deklarasitipe bilangan desimal

        // inputan/InPut
        System.out.print("Masukan bil bulat 1 :");
        a = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukan bil bulat 2 :");
        b = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukan bil bulat 3 :");
        c = masukan.nextInt();
        masukan.nextLine();

        // //Proses Perhitungan
        jumlah = a + b + c;
        rata = (double) jumlah / 3;
        // luas = phi * Math.pow(jari, 2);
        // // Untuk Math.pow(r,2)=r^2, Math.sqrt(n) = akar
        // // pangkat 2 dari n

        // // Cetak hasil/OutPut
        System.out.println("Rata-rata 3 Bilangan :" + rata);
        // System.out.println("Luas Lingkaran :" + luas);

    }
}