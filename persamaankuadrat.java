import java.util.*;
public class persamaankuadrat{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=0,b=0,c=0;
		double dis;
		double x1,x2;

		System.out.println("=====Persamaan Kuadrat=====");
		System.out.println("Diberikkan ax^2+bx+c");
		System.out.print("Masukkan nilai a: ");
		a = sc.nextInt();
		System.out.print("Masukkan nilai b: ");
		b = sc.nextInt();
		System.out.print("Masukkan nilai c: ");
		c = sc.nextInt();
		System.out.println("==============================");
		System.out.printf("Persamaan yang terbentuk: %dx^2+(%d)x+(%d)\n",a,b,c);
		dis = b*b - (4*a*c);
		if (dis==0){
			System.out.println("Memiliki 2 akar real yang sama");
		}else if(dis>0){
			System.out.println("Memiliki 2 akar real yang berbeda");
			x1 = (-b + Math.sqrt(dis))/(2*a);
			x2 = (-b - Math.sqrt(dis))/(2*a);
			System.out.printf("Yaitu x1= %f dan x2= %f\n",x1,x2);
		}else if(dis<0){
			System.out.println("Tidak memiliki akar real (khayal)");
			if(a<0){
				System.out.println("Termasuk definit negatif");
			}else{
				System.out.println("Termasuk definit postif");
			}
		}
	}
}