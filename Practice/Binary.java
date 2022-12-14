import java.util.*;
public class Binary{

  public static String toBinary(int num){
	String binary = "";
	while(num!=0){
		int x = num%2;
		num /=2;
		binary = x + binary; 
	}
	return binary;

  }

  public static void main(String ags[]){

	Random rand = new Random();
	int num = rand.nextInt(500);

	System.out.println("Binary of "+num+" is "+toBinary(num));

  }

}