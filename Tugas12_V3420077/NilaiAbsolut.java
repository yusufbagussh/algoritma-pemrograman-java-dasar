import java.util.Scanner; //Import the Scanner class

class NilaiAbsolut {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a scanner

        int x, absolut = 1;

        System.out.println("====== Menentukan Nilai Absolut ======");
        System.out.print("Inputkan Nilai : ");
        x = masukan.nextInt();
        masukan.nextLine();
        System.out.println("Nilai mutlak dari " + x + " adalah " + NilaiAbsolut(absolut, x));
        System.out.println("--------------------------------------");
    }

    public static long NilaiAbsolut(int absolut, int x) {
        if (x < 0) {
            absolut = -1 * x;
            return absolut;
        } else if (x > 0) {
            absolut = x;
            return absolut;
        } else {
            absolut = 0;
            return absolut;
        }
    }
}