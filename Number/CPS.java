import java.util.Random;
public class CPS{

  public static boolean isPerSqr(int n){
	int sqrt =(int) Math.sqrt(n);

	return ((n/Math.sqrt(n))==sqrt);
  }

  public static void main(String args[]){
	Random rd = new Random();

	int n = rd.nextInt(500);
	if(isPerSqr(n))
		System.out.println(n+" is perfect Square");
	else
		System.out.println(n+" isnt Perfect Square");

	System.out.println(100+" is perfect Square..."+isPerSqr(100));
  }

}