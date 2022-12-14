import java.util.Random;
public class NamePlate{

   public static String makePlateNum(){
	Random rand = new Random();
	String str = "";
	for(int i=0;i<3;i++){
		char ch = (char)(rand.nextInt(26)+65);
		str+=ch;
	}
	for(int i=0;i<4;i++){
		int ch = rand.nextInt(10);
		str+=ch;
	}
	return str;

  }

  public static void main(String args[]){

	Random rand = new Random();
	int n = rand.nextInt(4)+2;
	for(int i=0;i<n;i++){
		System.out.println("Plate Number "+(i+1)+" : "+makePlateNum());
	}




  }








}