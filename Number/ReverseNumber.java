import java.util.Random;
public class ReverseNumber{

   public static int reverse(int num){
	int rev = 0;
	while(num != 0){
		int a = num%10;
		num /=10;
		rev = 10*rev + a;
	}

	return rev;
   }


   public static void main(String args[]){

	Random rd = new Random();
	int n = rd.nextInt();

	System.out.println(n+" : "+reverse(n));
   }



}