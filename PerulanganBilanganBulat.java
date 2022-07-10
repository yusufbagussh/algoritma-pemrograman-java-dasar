import java.util.Scanner; //Import the Scanner class

class PerulanganBilanganBulat {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        int i, a, b, besar, kecil;

        System.out.print("Inputkan nilai a: ");
        a = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Inputkan nilai b: ");
        b = masukan.nextInt();
        masukan.nextLine();

        if (a > b) {
            besar = a;
            kecil = b;
        } else {
            besar = b;
            kecil = a;
        }
        for (i = kecil; i <= besar; i++) {
            System.out.print(i + " ");
        }
    }
}