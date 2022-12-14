import java.util.Scanner;
public class Beautify{

  public static String beautify(String str){

	char start = str.charAt(0);
	if(Character.isLowerCase(start)){
		start = (char) (start - 32);
		str = start + str.substring(1,str.length());
	}
	if(!str.endsWith("."))
		str = str + ".";
	return str;

  }

  public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Input string : ");
	String str = sc.nextLine();

	System.out.println(beautify(str));
  }







}