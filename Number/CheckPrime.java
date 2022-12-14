import java.util.Random;
public class CheckPrime{

  public static boolean isPrime(int n){

	int ch = 0;
	for(int i=2;i<n;i++){
	  if(n%i==0)
		ch++;
	}

	return ch==0;
  }

  public static void main(String args[]){

	Random rd = new Random();
	int n = rd.nextInt(6000);
	if(isPrime(n))
	  System.out.println(n+" is Prime");
	else
	  System.out.println(n+" isnt Prime");
  }



}