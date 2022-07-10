import java.util.Scanner; //Import the Scanner class

class LuasKelilingSegitiga {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object

        // deklarasi
        double alas, tinggi, miring, keliling, luas; // deklarasitipe bilangan desimal

        // inputan
        System.out.println("Mencari Luas dan Keliling Segitiga");
        System.out.print("Masukan alas :");
        alas = masukan.nextDouble();
        masukan.nextLine(); // input double jari-jari
        System.out.print("Masukan tinggi :");
        tinggi = masukan.nextDouble();
        masukan.nextLine();

        // Perhitungan
        miring = Math.sqrt((Math.pow(alas / 2, 2) + Math.pow(tinggi, 2)));
        keliling = 2 * miring + alas;
        luas = alas * tinggi / 2;
        // luas = phi * Math.pow(jari, 2);
        // Untuk Math.pow(r,2)=r^2, Math.sqrt(n) = akar pangkat 2 dari n

        // Cetak hasil
        System.out.println("Sisi Miring Segitiga :" + miring);
        System.out.println("Keliling Segitiga :" + keliling);
        System.out.println("Luas Segitiga :" + luas);

    }
}