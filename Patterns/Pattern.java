import java.util.Scanner;
public class Pattern{

  public static void tringle(int n){
	for(int i=0;i<n;i++){
	  for(int j=0;j<n;j++){
	    if(j>=i)
		System.out.print("*");
	    else
		System.out.print("");
	  }
	  System.out.print("\n");
	}
  }

  public static void tri(int n){
	for(int i=0;i<n;i++){
	  for(int j=0;j<n;j++){
	    if(j>=n-i)
		System.out.print("*");
	    else
		System.out.print("");
	  }
	  System.out.print("\n");
	}
  }

  public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Input : ");
	int n = sc.nextInt();
	tringle(n);	
	tri(n);	
	tringle(n);	
	tri(n);
  }


}