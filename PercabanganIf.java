import java.util.Scanner; //Import the Scanner class

import javax.lang.model.util.ElementScanner6;

class PercabanganIf {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object

        // deklarasi
        int nilai; // deklarasitipe bilangan desimal
        String statuslulus, ucapan = "anda belum beruntung";
        char konversi;

        // inputan
        System.out.print("Masukan nilai :");
        nilai = masukan.nextInt();
        masukan.nextLine();

        // Perhitungan
        // if tanpa else
        if (nilai < 0) {
            System.out.println("Nilai tidak valid");
        }

        // Tipe satu
        if (nilai >= 60) {
            System.out.println("Anda lulus");
        } else {
            System.out.println("Anda tidak lulus");
        }

        // Tipe dua
        if (nilai >= 60) {
            statuslulus = "LULUS";
            ucapan = "selamat";
        } else {
            statuslulus = "TIDAK LULUS";
        }

        // if bersarang / nested if

        if (nilai < 60) {
            konversi = 'C';
        } else if (nilai < 80) {
            konversi = 'B';
        } else {
            konversi = 'A';
        }

        // // untuk dari besar ke kecil
        // if (nilai >= 80) {
        // konversi = 'C';
        // } else if (nilai >= 60) {
        // konversi = 'B';
        // } else {
        // konversi = 'A';
        // }

        // if dengan 2 kondisi dengan operator logika (and/or)
        String validnilai;
        if ((nilai >= 0) & (nilai <= 100)) {
            validnilai = "VALID";
        } else {
            validnilai = "TIDAK VALID";
        }

        // String validnilai;
        // if ((nilai < 0) | (nilai > 100)) {
        // validnilai = "TIDAK VALID";
        // } else {
        // validnilai = "VALID";
        // }

        // Cetak hasil
        System.out.println("Nilai adalah :" + nilai);
        System.out.println("Status Kelulusan adalah :" + statuslulus + ", " + ucapan);
        System.out.println("Nilai konversi adalah :" + konversi);
        System.out.println("Kevalidan Nilai adalah :" + validnilai);
    }
}