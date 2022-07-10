import java.util.Scanner; //Import the Scanner class

class WhileGanjilGenap {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object
        // Bagian Deklarasi
        int i, bil;
        char ulang = 'y';// NILAI AWAL

        while (ulang == 'y' || ulang == 'Y') // KONDISI
        {
            System.out.print("Masukkan bilangan yang akan dicek ganjil/genap : ");
            bil = masukan.nextInt();
            masukan.nextLine();

            if (bil % 2 == 1) {
                System.out.println("Bilangan " + bil + " termasuk bilangan ganjil");
            } else {
                System.out.println("Bilangan " + bil + " termasuk bilangan genap");
            } // TERMINASI
            System.out.print("Apakah anda ingin input bilangan lagi ? (y/n) : ");
            ulang = masukan.next().charAt(0);
            masukan.nextLine();
        }
    }
}