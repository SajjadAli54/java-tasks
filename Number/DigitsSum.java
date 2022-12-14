import java.util.Random;
public class DigitsSum{

  public static int sumOfDigits(int num){

	int sum = 0;
	while(num != 0){
		sum += num%10;
		num /=10;
	}
	return Math.abs(sum);
  }

  public static void main(String arfgs[]){

	Random rd = new Random();
	int n = rd.nextInt();

	System.out.println("Sum od digits "+n+" : "+sumOfDigits(n));

  }




}