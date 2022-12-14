import java.util.Scanner;
class X{
  public static void main(String args[]){
	Scanner obj = new Scanner(System.in);
	System.out.print("Input : ");
	int n = obj.nextInt();
	for(int i=1;i<=2*n+1;i++){
	 for(int j=1;j<=2*n+1;j++){
	   if(j==i || j+i==2*n+2)
		System.out.print("*");
	   else
		System.out.print(".");
	 }
	   System.out.print("\n");
	}
  }
}