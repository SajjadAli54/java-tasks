import java.util.Random;
public class Sum{

   public static int sum(int n){
	int sum = 0;
	for(int i=1;i<=n;i++){
	  sum +=i;
	}
	return sum;
   }

   public static void main(String args[]){
	Random rd = new Random();

	int n= rd.nextInt(100);

	System.out.println("Sum of n natural numbers : "+sum(n));

   }






}