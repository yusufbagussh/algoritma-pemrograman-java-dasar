import java.util.Scanner;
class no1pangkat {
	public static void main(String[] abc) {

    Scanner data = new Scanner(System.in);
	int x,y;
	
	System.out.println("Menghitung nilai pangkat"+"\n");
	System.out.println("X ^y"+"\n");
	System.out.print("Masukkan nilai x : ");
	x=data.nextInt();
	System.out.print("Masukkan nilai y : ");
	y=data.nextInt();
	
	System.out.print("hasilnya : "+pangkat(x,y));
	
	}//end main
	public static int pangkat(int x, int y){
		if (y==0){
			return 1;
		}else{
		return x*pangkat(x,y-1);
		}
	}
}
	