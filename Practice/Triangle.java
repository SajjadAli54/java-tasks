import java.util.Scanner;
class Triangle{

 public static void main(String args[]){

	Scanner obj = new Scanner(System.in);
	System.out.print("Input the number of rows : ");
	int n = obj.nextInt();

	for(int i=0;i<n;i++){
	 for(int j=n;j>n-i;j--)
		System.out.print(".");
	 for(int k=i;k<n-1;k++)
		System.out.print("*");
	 System.out.println();
	}	
 }
}