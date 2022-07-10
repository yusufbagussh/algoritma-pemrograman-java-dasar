import java.util.Scanner; //Import the Scanner class

class LuasPersegiPanjang {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object

        double panjang, lebar, luas; // deklarasitipe bilangan desimal

        System.out.print("Masukan panjang :");
        panjang = masukan.nextDouble();
        masukan.nextLine(); // input double panjang
        System.out.print("Masukan lebar :");
        lebar = masukan.nextDouble();
        masukan.nextLine(); // input double lebar

        luas = panjang * lebar;

        System.out.println("Luas Persegi Panjang :" + luas);

    }
}