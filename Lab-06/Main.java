import java.util.Scanner;
abstract class Player{

	String name;

	abstract void setName(String str);

	String getName(){
		return name;
	}


}

class FootballPlayer extends Player{

	void setName(String str){
		super.name = str;
	}

}


class Main{

 public static void main(String args[]){

	FootballPlayer obj = new FootballPlayer();
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Input the name : ");
	String str = sc.nextLine();
	obj.setName(str);
	System.out.println("Football Player Name is : "+obj.getName());





 }

}