import java.util.Scanner;
public class Calculator{

    public static void main(String args[]){

	Scanner key = new Scanner(System.in);

	double res = 0.0;

	String input = "";

	System.out.println("Calculator is on");
	System.out.println("\nResult : "+res);
	while(true){
		char c = ' ';
		try{
			input = key.nextLine();
			c = input.charAt(0);

			double num = 0;
			if(!input.equalsIgnoreCase("r"))
				num = Double.parseDouble(input.substring(1));
			else{
				System.out.println("Final Result : "+res);
				System.out.println("Again ? (y/n)");
				String check = key.nextLine();
				if(check.equalsIgnoreCase("No"))
					break;
				else{
					res = 0.0;
					System.out.println("result : "+res);
					continue;
				}
			}
			
			if(c=='+'){
				res += num;
			}
			else if(c == '*'){
				res *= num;
			}
			else if(c == '/'){
				res /= num;
			}
			else if(c == '-'){
				res -= num;
			}
			else
				throw new UnknownOperatorException();
			System.out.println("result "+input +" : "+res);
			System.out.println("updated Result : "+res);
		}
		catch(Exception e){
			System.out.println(c+" is an unknow operator\n Reenter your last line");
		}
	}
   }

}

class UnknownOperatorException extends Exception{

      public String toString(){
	return ("Unknown Operator Exception");
     }

}