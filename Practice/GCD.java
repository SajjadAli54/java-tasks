import java.util.Random;
public class GCD{

  public static int gcd(int x,int y){
	int n=0;
	if(x>=y){
	  if(x%y==0)
		return y;
	  else
		n = y;
	}
	if(y>=x){
	  if(y%x==0)
		return x;
	  else
		n = x;
	}
	int m=1;
	for(int i=2;i<n;i++){
		if(y%i==0 && x%i==0)
			m = i;
	}
	return m;
  }


  public static void main(String args[]){

	Random rand = new Random();
	int x=rand.nextInt(500)+10;
	int y=rand.nextInt(500)+10;

	System.out.println("The gcd of the pair "+x+" "+y+" is "+gcd(x,y));
  }

}