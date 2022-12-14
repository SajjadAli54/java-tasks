import java.util.Random;
public class Diamond{

  public static void pattern(int n){

	for(int i=1;i<=n;i++){
	 for(int j=i;j<n;j++){
	   System.out.print(" n");
	 }
	 for(int k=1;k<(i*2);k++){
	   System.out.print("*");
	 }
	 System.out.println();
	}

	for(int i=n-1;i>=1;i--){
	 for(int j=n;j>i;j--){
	   System.out.print(" ");
	 }
	 for(int k=1;k<(i*2);k++){
	   System.out.print("*");
	 }
	 System.out.println();
	}
  }

  public static void main(String args[]){

	Random rd = new Random();

	pattern(rd.nextInt(5)+3);
  }

}