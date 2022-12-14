import java.util.Random;
import java.util.Scanner;
public class Palindrome{

   public static boolean pal(int num){
	int check = num;
	int rev = 0;
	while(num!=0){
		int rem = num%10;
		num /= 10;
		rev = 10*rev + rem;
	}
	return rev == check;
   }

   public static void main(String args[]){
	Random rd = new Random();
	int n = rd.nextInt();

	if(pal(n))
		System.out.println(n+" is palindrome");
	else
		System.out.println(n+" is not palindrome");

	System.out.println(121+" is palindrome..."+pal(121));
   }


}