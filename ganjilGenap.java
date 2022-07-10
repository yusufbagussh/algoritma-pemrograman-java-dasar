import java.util.Scanner;
public class ganjilGenap {
    public static void main(String[] args) {
      int bil;
      Scanner input = new Scanner(System.in);

      System.out.print("Masukkan bilangan : ");
      bil = input.nextInt();

      if (bil < 0){
        System.out.print("Bilangan " + bil + " merupakan nilai negatif.");
        } else if (bil % 2 == 0) {
            System.out.print("Bilangan " + bil + " adalah genap.");
        } else {
            System.out.print("Bilangan " + bil + " adalah ganjil.");
    }
  }
}