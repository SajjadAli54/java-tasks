import java.util.Random;
import java.util.Vector;
public class PrimeFactor{

  public static Vector factors(int num){
	Vector<Integer> fact = new Vector<Integer>();
	for(int i=2;i<=num;i++){
	  if(num%i==0){
	    int check = 0;
	    for(int j=2;j<i;j++){
		if(i%j==0){
		  check++;
		}
	    }
	    if(check==0){
		fact.add(i);
	    }
	  }

	}
	return fact;
  }

  public static void main(String args[]){

	Random rd = new Random();
	int num = rd.nextInt(50000);

	System.out.println(num+" : "+factors(num));

  }




}