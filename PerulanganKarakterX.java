import java.util.Scanner; //Import the Scanner class

class PerulanganKarakterX {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object
        // Bagian Deklarasi
        char karakter;

        // System.out.print("Masukan karakter: ");
        // karakter = masukan.next().charAt(0);
        // masukan.nextLine();

        // while (karakter != 'x' & karakter != 'X') {
        // System.out.println(karakter);

        // System.out.print("Masukan karakter: ");
        // karakter = masukan.next().charAt(0);
        // masukan.nextLine();
        // }

        do {
            System.out.print("Masukan karakter: ");
            karakter = masukan.next().charAt(0);
            masukan.nextLine();
            System.out.println(karakter);
        } while (karakter != 'x' & karakter != 'X');

    }
}