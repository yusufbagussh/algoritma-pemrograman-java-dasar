import java.util.Scanner; //Import the Scanner class

class UrutanBilangan {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object
        int a, b; // deklarasitipe bilangan desimal

        System.out.println("==== Menentukan Urutan Bilangan dari yang Terkecil ====");
        System.out.print("Masukan Bilangan Pertama :");
        a = masukan.nextInt(); // Read user input string
        System.out.print("Masukan Bilangan Kedua:");
        b = masukan.nextInt(); // Read user input string

        if (a > b) {
            System.out.println("Urutan bilangan :" + b + "," + a);
        } else {
            System.out.println("Urutan bilangan :" + a + "," + b);

        }
    }
}