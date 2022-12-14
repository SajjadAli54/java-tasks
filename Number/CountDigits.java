import java.util.Random;
public class CountDigits{

   public static int countByLoop(int num){
	int count = 0;
	while(num != 0){
		num /=10;
		count++;
	}
	return count;

   }

   public static int countByConverse(int num){
	String str = Integer.toString(num);
	int count = str.length();
	return count;
   }

   public static void main(String args[]){

	Random rd = new Random();

	int n = rd.nextInt();

	System.out.println("The number od digits in "+n+" is "+countByLoop(n));
	System.out.println("The number od digits in "+n+" is "+countByConverse(n));
   }









}