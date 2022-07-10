import java.util.Scanner; //Import the Scanner class

class MobilBerpapasan {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        // deklarasi
        double t, s1, s2, jarak, v1, v2;

        // inputan
        System.out.println("Mencari waktu dan jarak dua mobil berpapasan");
        System.out.print("Masukan kecepatan mobil A (km/jam) :");
        v1 = masukan.nextDouble();
        masukan.nextLine();
        System.out.print("Masukan Kecepatan mobil B (km/jam) :");
        v2 = masukan.nextDouble();
        masukan.nextLine();
        System.out.print("Masukan jarak (km):");
        jarak = masukan.nextDouble();
        masukan.nextLine();

        // Perhitungan
        t = (double) jarak / (v1 + v2);
        s1 = (double) v1 * t;
        s2 = (double) v2 * t;
        // sisimiring = (Double) Math.sqrt((Math.pow(a / 2, 2) + Math.pow(t, 2)));
        // s1 = sisimiring;
        // s2 = s1;
        // keliling = (double) s1 + s2 + a;
        // luas = (double) a * t / 2;

        // Cetak hasil
        System.out.println("Waktu bertemu dua mobil :" + t + "jam");
        System.out.println("Jarak bertemu mobil A :" + s1 + "km");
        System.out.println("Jarak bertemu mobil B :" + s2 + "km");
        // System.out.println("Keliling Segitiga :" + keliling);
        // System.out.println("Luas Segitiga :" + luas);

    }
}