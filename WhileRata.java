import java.util.Scanner; //Import the Scanner class

class WhileRata {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object
        // Bagian Deklarasi
        int banyakbil = 0, bil, total = 0;
        char ulang = 'y';
        double rata;

        while (ulang == 'y' || ulang == 'Y') // kondisi
        do {
            System.out.print("Masukan bilangan untuk dicari rata : ");// Badan Perulangan
            bil = masukan.nextInt();
            masukan.nextLine();
            total = total + bil;
            banyakbil = banyakbil + 1;
            // Teminasi
            System.out.print("Apakah anda ingin input bilangan lagi ? (y/n) : ");
            ulang = masukan.next().charAt(0);
            masukan.nextLine();//
        }
        rata = (double) total / banyakbil;
        System.out.println("Hasil dari rata2 adalah : " + rata);

    }
}