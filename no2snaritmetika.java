import java.util.Scanner;
class no2snaritmetika{
	public static void main(String[] abc) {

    Scanner data = new Scanner(System.in);
	int a,b,n;
	
	System.out.println("Menghitung jumlah bilangan aritmetika"+"\n");
	System.out.print("Masukkan nilai awal : ");
	a=data.nextInt();
	System.out.print("Masukkan nilai beda : ");
	b=data.nextInt();
	System.out.print("Masukkan banyak bilangan : ");
	n=data.nextInt();
	
	System.out.print("Hasilnya "+snaritmetika(a,b,n));
	}//end main
	public static int snaritmetika(int a,int b,int n){
		int c=n/2;
		int d=2*a;
		int e=b*n-b;
		int sn=c*(d+e);
		return sn;
	}
}