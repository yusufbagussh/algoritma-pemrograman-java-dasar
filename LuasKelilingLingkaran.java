import java.util.Scanner; //Import the Scanner class

class LuasKelilingLingkaran {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object

        // deklarasi
        double jari, keliling, luas; // deklarasitipe bilangan desimal
        final double phi = 3.14;

        // inputan
        System.out.print("Masukan jari-jari :");
        jari = masukan.nextDouble();
        masukan.nextLine(); // input double jari-jari

        // Perhitungan
        keliling = 2 * phi * jari;
        luas = phi * jari * jari;
        luas = phi * Math.pow(jari, 2);
        // Untuk Math.pow(r,2)=r^2, Math.sqrt(n) = akar
        // pangkat 2 dari n

        // Cetak hasil
        System.out.println("Keliling Lingkaran :" + keliling);
        System.out.println("Luas Lingkaran :" + luas);

    }
}