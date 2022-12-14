import java.util.Random;
class Char implements CharSequence{
	String str = "Hello World! Dear I love reading.";

	public int fromEnd(int i){
	  int letters = 0;
	  if(i < str.length())
	    letters = str.length() - i;
	  return letters;
	}

	public char charAt(int i){
	  return str.charAt(i);
	}

	public int length(){
	  return str.length();
	}

	public CharSequence subSequence(int start, int end){
	  String text = "";
	  for(int i=start;i<=end;i++){
	     text+=str.charAt(i);
	  }
	  return text;
	}

	public String toString(){
	  return str;
	}

	public static int random(int max){
	  Random rd = new Random();
	  return rd.nextInt(max);
	}


  public static void main(String args[]){
	Char obj = new Char();

	System.out.println("Letters from end of 6 "+obj.fromEnd(6));
	
	System.out.println("Character at 6 : "+obj.charAt(6));

	System.out.println("Length of string : "+obj.length());

	System.out.println("SubSequence at 6 to 11 : "+obj.subSequence(6,11));

	System.out.println("String : "+obj);

	System.out.println("Random to 50 : "+obj.random(50));
  }
}