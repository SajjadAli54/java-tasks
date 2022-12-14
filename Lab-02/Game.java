import java.util.Random;
import java.util.Scanner;
class Game{
 public static void main(String args[]){
	Scanner obj = new Scanner(System.in);
	Random rand = new Random();
	
	System.out.print("Input any number :  ");
	int guess = obj.nextInt();

	int opt = rand.nextInt(11);

	if(opt == guess)
		System.out.println("Right guess.");
	else
		System.out.println("Wrong guess. correct option is "+opt);


 }
}