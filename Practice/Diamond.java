import java.util.Random;
public class Diamond{

 public static void main(String ragss[]){
	Random rand = new Random();
	int n=rand.nextInt(5)+5;

	int s = n-1;
	for(int i=1;i<=n;i++){
	 for(int j=1;j<=s;j++)
		System.out.print("-");
	 for(int j=1;j<=2*i-1;j++)
		System.out.print("*");
	 for(int j=1;j<=s;j++)
		System.out.print("-");
	 s--;
	 System.out.println();
	}	

	s=1;
	for(int i=1;i<=n-1;i++){
	 for(int j=1;j<=s;j++)
		System.out.print("-");
	 for(int j=1;j<=2*(n-i)-1;j++)
		System.out.print("*");
	 for(int j=1;j<=s;j++)
		System.out.print("-");
	 s++;
	 System.out.println();
	}



 }
}