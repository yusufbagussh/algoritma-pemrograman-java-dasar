import java.util.Scanner; //Import the Scanner class

class MenghitungLuasKelilingSegitiga {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        // deklarasi
        double s1, s2, a, t, keliling, luas, sisimiring;

        // inputan
        System.out.println("Mencari Luas dan Keliling Segitiga");
        System.out.print("Masukan alas :");
        a = masukan.nextDouble();
        masukan.nextLine();
        System.out.print("Masukan tinggi :");
        t = masukan.nextDouble();
        masukan.nextLine();

        // Perhitungan
        sisimiring = (Double) Math.sqrt((Math.pow(a / 2, 2) + Math.pow(t, 2)));
        s1 = sisimiring;
        s2 = s1;
        keliling = (double) s1 + s2 + a;
        luas = (double) a * t / 2;

        // Cetak hasil
        System.out.println("Sisi Miring Segitiga :" + sisimiring);
        System.out.println("Keliling Segitiga :" + keliling);
        System.out.println("Luas Segitiga :" + luas);

    }
}