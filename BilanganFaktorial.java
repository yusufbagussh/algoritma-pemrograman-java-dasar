import java.util.Scanner; //Import the Scanner class

class BilanganFaktorial {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);
        long faktorial = 1;
        int n, i = 1;

        System.out.print("Inputkan Nilai Faktorial: ");
        n = masukan.nextInt();
        masukan.nextLine();

        for (i = 1; i <= n; i++) {
            faktorial = faktorial * i;
        }

        System.out.print("Faktorial dari " + n + " adalah " + faktorial);

    }
}