import java.util.Scanner;
public class Armstrong{

   public static boolean isArm(int num){
	int pow = Integer.toString(num).length();
	int ch = num;
	int arm = 0;
	while(num !=0){
	  int rem = num%10;
	  num /=10;
	  arm += Math.pow(rem,pow);
	}

	return (arm == ch);
   }

   public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Input : ");
	int n = sc.nextInt();

	System.out.println(n+" is Armstrong Number ..."+isArm(n));
  }





}