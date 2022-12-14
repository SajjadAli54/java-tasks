import java.util.Scanner;
class operat {
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number a : ");
		int a = obj.nextInt();
		System.out.print("Enter number b : ");
		int b = obj.nextInt();
		System.out.print("The result of addition        : " + (a+b)+"\n");
		System.out.print("The result of subtraction     : " + (a-b)+"\n");
		System.out.print("The result of multiplication  : " + (a*b)+"\n");
		System.out.print("The result of division        : " + (a/b)+"\n");
}
}