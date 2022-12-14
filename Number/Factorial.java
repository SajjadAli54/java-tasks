import java.util.Random;
public class Factorial{

  public static int fact(int num){

	int fact = 1;
	for(int i=1;i<=num;i++){
		fact *= i;
	}
	return fact;
  }

  public static int fac(int num){
	if(num<=1)
		return 1;
	else
		return num * fac(num-1);

  }

  public static void main(String args[]){
	
	Random rd = new Random();

	int num = rd.nextInt(10);

	System.out.println(num+" : "+fact(num));
	System.out.println(num+" : "+fac(num));
  }

}