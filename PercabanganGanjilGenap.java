import java.util.Scanner; //Import the Scanner class

class PercabanganGanjilGenap {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object
        int a; // deklarasitipe bilangan desimal

        System.out.print("Masukan Bilangan :");
        a = masukan.nextInt(); // Read user input string

        if (a % 2 == 1) {
            System.out.println("Angka " + a + " adalah bilangan " + "ganjil");
        } else if (a % 2 == 0) {
            System.out.println("Angka " + a + " adalah bilangan " + "genap");
        } else {
            System.out.println("Nilai negatif");
        }
    }
}