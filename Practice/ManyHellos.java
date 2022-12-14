import java.util.Scanner;
class ManyHellos{

 public static void main(String args[]){

	Scanner obj = new Scanner(System.in);
	System.out.print("Input number of hellos : ");
	int n = obj.nextInt();
	for(int i=1;i<=n;i++){
		switch(i%10){
			case 1:
			if(i==11)
			 System.out.println(i+"th Hello");
			else
			 System.out.println(i+"st Hello");
			break;
			case 2:
			if(i==12)
			 System.out.println(i+"th Hello");
			else
			 System.out.println(i+"nd Hello");
			break;
			case 3:
			if(i==13)
			 System.out.println(i+"th Hello");
			else
			 System.out.println(i+"rd Hello");
			break;
			default:
			System.out.println(i+"th Hello");
		}
	}


 }
}