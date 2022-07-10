import java.util.Scanner; //Import the Scanner class

class MenukarDuaData {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a scanner

        int[] data = new int[3];

        System.out.println("====== Menukar Dua Data ======");
        System.out.print("Inputkan Data 1 : ");
        data[1] = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Inputkan Data 2 : ");
        data[2] = masukan.nextInt();
        masukan.nextLine();
        tukardata(data);
        System.out.println("Data 1 : " + data[1]);
        System.out.println("Data 1 : " + data[2]);
        System.out.println("--------------------------------------");
    }

    public static void tukardata(int[] a) {
        int temp;
        temp = a[1];
        a[1] = a[2];
        a[2] = temp;
    }
}