import java.util.Scanner; //Import the Scanner class

class Pangkat {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        int x = 0, y = 0, i = 1, hasil = 1;

        System.out.print("Inputkan Angka yang akan dipangkat : ");
        x = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Inputkan Pangkat: ");
        y = masukan.nextInt();
        masukan.nextLine();

        System.out.println("Hasil dari " + x + " pangkat " + y + " adalah " + pangkat(i, x, y, hasil));
        System.out.println("Hasil dari " + x + " pangkat " + y + " adalah " + pangkatrekursif(x, y));
    }

    public static int pangkat(int i, int x, int y, int hasil) {

        for (i = 1; i <= y; i++) {
            hasil = hasil * x;
        }
        return hasil;
    }

    public static int pangkatrekursif(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * pangkatrekursif(x, y - 1);
        }
    }
}