import java.util.Scanner;
class no4fibonacci{
	public static void main(String[] abc) {

    Scanner data = new Scanner(System.in);
	int n;
	
	System.out.println("Menentukan deret ke-n deret fibonacci"+"\n");
	System.out.print("deret fibonacci 1,1,2,3,5,8,..."+"\n");
	System.out.print("Masukkan banyak bilangan : ");
	n=data.nextInt();
	
	System.out.print("Hasilnya "+Fib(n));
	}//end main
	public static int Fib(int n){
		if(n==1){
			return 1;
		}else if(n==2){
			return 1;
		}else {
		return Fib(n-1)+Fib(n-2);
	}
	}
}