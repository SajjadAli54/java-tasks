// Password Validator
import java.util.Scanner;
public class TextSpecify{

   public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Password : ");
	String str = sc.nextLine();

	if(isValid(str))
		System.out.println("Strong Password");
	else
		System.out.println("Invalid Password");	

   }

   public static boolean isValid(String str){
	if(str.length() <7)
		return false;
	char[] sk = {'~','@','#','$','&','*','^','%','!','(',')',':',';','<','>','?','.'};

	int s = 0, n = 0, a = 0;
     for(int i=0;i<str.length();i++){
	if(isNum(str.charAt(i)))
	   n++;
	else if(isAlpha(str.charAt(i)))
	   a++;
	else if(isSK(str.charAt(i),sk))
	   s++;
	else if(str.charAt(i)==' ')
	   return false;
     }

      return (n>=2 && s>=2 && a>=3);
   }

   public static boolean isNum(char ch){

	return (ch>='0' && ch<='9');
   }  

   public static boolean isAlpha(char ch){

	return ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'));
   }

   public static boolean isSK(char ch, char[] sk){

	for(char x:sk){
	  if(ch==x)
		return true;
	}

	return false;

   }


}