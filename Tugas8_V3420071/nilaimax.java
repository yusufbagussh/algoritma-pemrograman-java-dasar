import java.util.Scanner;
class nilaimax{
	static Scanner data = new Scanner (System.in);
	public static void main(String[]abc){
		Scanner masukan = new Scanner(System.in);
		
		//bagian deklarasi
		int a,b,c,maksimum;
		
		System.out.println("---Mencari Nilai Maksimum---");
		System.out.println("                            ");
		
		System.out.print("Masukkan Nilai a :");
		a= data.nextInt();data.nextLine();
		System.out.print("Masukkan Nilai b :");
		b= data.nextInt();data.nextLine();
		System.out.print("Masukkan Nilai c :");
		c= data.nextInt();data.nextLine();
		
		if (a>b&a>c)
		{maksimum=a;}else
		if (b>a&b>c)
		{maksimum=b;} else
		{maksimum=c;}
	
		System.out.println("Nilai Maksimum :"+maksimum);
	}
}