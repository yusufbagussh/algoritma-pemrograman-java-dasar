import java.util.Scanner;
class bilganjilgenap{
	static Scanner data = new Scanner (System.in);
	public static void main(String[]abc){
		Scanner masukan = new Scanner(System.in);
		
		int bilangan;
		
		System.out.println("---Menentukan Bilangan Ganjil/Genap---");
		System.out.println("                            ");
		
		System.out.print("Masukkan Angka :");
		bilangan= data.nextInt();data.nextLine();
		
		if(bilangan<0)
		{System.out.print("Bilangan " + bilangan + " merupakan bilangan negatif.");}else
		if(bilangan>0&bilangan % 2 ==0)
		{System.out.print("Bilangan " + bilangan + " merupakan bilangan genap.");}else
		{System.out.print("Bilangan " + bilangan + " merupakan bilangan ganjil.");}
	}
}