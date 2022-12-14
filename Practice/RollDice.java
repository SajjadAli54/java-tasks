import java.util.Random;
import java.util.Scanner;;
public class RollDice{

  public static void rollDice(){

	Random rand = new Random();

	int n = rand.nextInt(6)+1;

	System.out.println("Roll Dice : "+n);

  }

  public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	char c = ' ';
	do{
		rollDice();
		System.out.print("Do you wanna play more? press y for yes and n for no");
		c = sc.nextLine().charAt(0);

	}
	while(c=='y');



  }








}