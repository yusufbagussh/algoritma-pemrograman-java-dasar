import java.util.Scanner; //Import the Scanner class

class Menukar2Data {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        // deklarasi
        int a, b, temp;

        // inputan
        System.out.println("===Menukar Dua Data===");
        System.out.print("Masukan nilai a :");
        a = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukan nilai b :");
        b = masukan.nextInt();
        masukan.nextLine();

        // Perhitungan
        temp = a;
        a = b;
        b = temp;

        // Cetak hasil
        System.out.println("Nilai a :" + a);
        System.out.println("Nilai b :" + b);

    }
}