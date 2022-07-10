import java.util.Scanner; //Import the Scanner class

class BilanganPangkat {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        int x = 0, y = 0, i = 1;
        double hasil = 1;

        System.out.print("Inputkan Angka yang akan dipangkat : ");
        x = masukan.nextInt();
        masukan.nextLine();

        System.out.print("Inputkan Pangkat: ");
        y = masukan.nextInt();
        masukan.nextLine();

        while (i <= y) {
            hasil = hasil * x;
            i++;
        }

        System.out.println("Hasil dari " + x + " pangkat " + y + " adalah " + hasil);

    }
}