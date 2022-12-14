import java.util.Random;
public class Check{

  public static void main(String args[]){

	int n = new Random().nextInt(6)+3;
	for(int i=1;i<=n;i++){
	  if(i%2==0)
		System.out.print(" ");
	  for(int j=0;j<n;j++){
		  System.out.print("* ");
	  }
	  System.out.println();
	}


  }

}