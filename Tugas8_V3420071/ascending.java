import java.util.Scanner;
class ascending{
	static Scanner data = new Scanner (System.in);
	public static void main(String[]abc){
		Scanner masukan = new Scanner(System.in);
		
		System.out.println("---Mencari Ascending 2 data---");
		System.out.println("                            ");
		
		//bagian deklarasi
		int a,b;
		
		System.out.print("Masukkan Nilai a :");
		a= data.nextInt();data.nextLine();
		System.out.print("Masukkan Nilai b :");
		b= data.nextInt();data.nextLine();
		
		if (b>a){
			System.out.println("Urutan bilangan : "+a+","+b);
		}else{
			System.out.println("Urutan bilangan : "+b+","+a);
		}
	}
}