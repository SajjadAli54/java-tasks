import java.util.Scanner;
public class Average{

   public static double avg(int n){

	Scanner key = new Scanner(System.in);

	int sum = 0;
	int num = 0;
	for(int i=0;i<n;i++){
		boolean done = false;
		while(!done){
			try{
				System.out.print("Input a number : ");
				num = key.nextInt();
				if(num < 0)
					throw new Exception("number must be positive");
				done = true;
			}
			catch(Exception e){
				key.nextLine();
				System.out.println(e.getMessage());
			}
		}
		sum += num;
	}
	
	try{
		double avg = sum/n;
		return avg;
	}
	catch(Exception e){
		return 0;
	}
   }

   public static void main(String args[]){

	Scanner key = new Scanner(System.in);

	System.out.print("limit : ");
	int n = key.nextInt();

	System.out.println("Avearge : "+avg(n));



   }






}                                         