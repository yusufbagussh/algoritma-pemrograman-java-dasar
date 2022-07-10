import java.util.Scanner;
class no3sngeometri{
	public static void main(String[] abc) {

    Scanner data = new Scanner(System.in);
	int a,n;
	double r;
	
	System.out.println("Menghitung jumlah bilangan geometri"+"\n");
	System.out.print("Masukkan nilai awal : ");
	a=data.nextInt();
	System.out.print("Masukkan nilai rasio: ");
	r=data.nextDouble();
	System.out.print("Masukkan banyak bilangan : ");
	n=data.nextInt();
	
	System.out.println("Hasilnya adalah : "+sngeometri(a,r,n));
	}//end main
	public static double sngeometri(int a, double r,int n){
		int i=n;
		double rn=1;
		while (i>0){
			
			rn*=r;
			i--;
		}
	System.out.println(""+a+","+r+","+n+","+rn);
		if (r>1){
			double sn=(a*(rn-1))/(r-1);
			return sn;
		}else {
			double sn=(a*(1-rn))/(1-r);
			return sn;
		}
	}
	}