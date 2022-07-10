import java.util.Scanner; //Import the Scanner class

class PerulanganJumlahBil {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object
        // Bagian Deklarasi
        int i, bil, jumlah = 0;

        System.out.print("Inputkan nilai bilangan: ");
        bil = masukan.nextInt();
        masukan.nextLine();

        for (i = 1; i <= bil; i++) {
            jumlah = jumlah + i;
        }

        System.out.println(jumlah);

    }
}