import java.util.Scanner; //Import the Scanner class

class HitungGajiBersih {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object

        // Structure Language

        // deklarasi
        double gajipokok, tunjangan, gajikotor, pajak, gajibersih; // deklarasitipe bilangan desimal

        // inputan/InPut
        System.out.print("Masukan gaji pokok :");
        gajipokok = masukan.nextDouble();
        masukan.nextLine();

        // //Proses Perhitungan
        tunjangan = 0.1 * gajipokok;
        gajikotor = gajipokok + tunjangan;
        pajak = 0.05 * gajikotor;
        gajibersih = gajikotor - pajak;

        // // Cetak hasil/OutPut
        System.out.println("Tunjangan :" + tunjangan);
        System.out.println("Gaji Kotor :" + gajikotor);
        System.out.println("Pajak :" + pajak);
        System.out.println("Gaji Bersih :" + gajibersih);

    }
}