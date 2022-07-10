import java.util.Scanner; //Import the Scanner class

class KonvesiWaktu {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        // deklarasi
        int jamA, menitA, detikA, jamB, menitB, detikB, konvjam, konvmenit, konvdetik, totalA, totalB, selisih, sisa1,
                sisa2;

        // inputan
        System.out.println("===Mencari Selisih Waktu===");
        System.out.print("Masukan jam mulai :");
        jamA = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukan menit mulai :");
        menitA = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukan detik mulai :");
        detikA = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukan jam selesai :");
        jamB = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukan menit selesai :");
        menitB = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukan detik selesai :");
        detikB = masukan.nextInt();
        masukan.nextLine();

        // Perhitungan
        totalA = jamA * 3600 + menitA * 60 + detikA;
        totalB = jamB * 3600 + menitB * 60 + detikB;
        selisih = totalB - totalA;

        sisa1 = selisih % 3600;
        konvjam = (selisih - sisa1) / 3600;

        sisa2 = sisa1 % 60;
        konvmenit = (sisa1 - sisa2) / 60;

        konvdetik = sisa2;

        // Cetak hasil
        System.out.println("Selisih jam :" + konvjam);
        System.out.println("Selisih menit :" + konvmenit);
        System.out.println("Selisih detik :" + konvdetik);
        System.out.println("Selisih waktu :" + konvjam + ":" + konvmenit + ":" + konvdetik);
    }
}